@Autowired
private SqlSession SqlSession;

@Override
public List<HairStyleFile> HairStyleFileRepository {
	return SqlSession.selectList("mapper.HairStyleMapper.getRegHairStyle");
}