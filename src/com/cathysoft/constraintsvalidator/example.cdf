CONSTRAINTS_DEFINITIONS(NAME="Test Check")
{
	CONTEXT
	{
		com.cathysoft.phdeers.domains.User user,
		com.cathysoft.phdeers.domains.BasicInfo basicInfo
	}
	CONSTRAINTS(GROUP="empty check")
	{
		NOT EMPTY user.* BUT user.id,
		NOT EMPTY basicInfo.x, basicInfo.y, basicInfo.z
	}
	CONSTRAINTS(GROUP="rule check #1")
	{
		ASSERTION user.question == user.answer,
		ASSERTION size(user.zjhm) == "18",
		ASSERTION middle(user.zjhm, "17", "1") == user.sex
	}
	CONSTRAINTS(GROUP="rule check #2")
	{
		DERIVATION basicInfo.ksfs="11" -> empty(user.ssxwny, basicInfo.ssxwsydwm),
		DERIVATION user.zylx="1" -> SIZE(user.zjhm) = "18"
	}
}