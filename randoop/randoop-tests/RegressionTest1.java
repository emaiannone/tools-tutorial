import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withDelimiter('\t');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker(',');
        boolean boolean8 = cSVFormat7.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat.Predefined predefined6 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv;
        java.lang.Object[] objArray8 = new java.lang.Object[] { false, (-1.0d), predefined6, (short) 0 };
        java.lang.String str9 = cSVFormat1.format(objArray8);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean14 = cSVFormat12.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser17 = org.apache.commons.csv.CSVParser.parse("", cSVFormat16);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withSystemRecordSeparator();
        boolean boolean21 = cSVFormat20.getIgnoreSurroundingSpaces();
        boolean boolean22 = cSVFormat10.equals((java.lang.Object) cSVFormat20);
        org.apache.commons.csv.CSVParser cSVParser23 = org.apache.commons.csv.CSVParser.parse("", cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + predefined6 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv + "'", predefined6.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "false\t-1.0\tMongoDBTsv\t0" + "'", str9, "false\t-1.0\tMongoDBTsv\t0");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVParser17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cSVParser23);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat.Builder builder9 = cSVFormat6.builder();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setAutoFlush(false);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setRecordSeparator('\"');
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setTrim(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat.Builder builder17 = builder13.setDelimiter("Delimiter=<\t> Escape=<\\> QuoteChar=< > QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The delimiter cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withHeader(resultSetMetaData12);
        boolean boolean14 = cSVFormat11.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat.Builder builder15 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withCommentMarker((java.lang.Character) '\"');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode13 = cSVFormat8.getDuplicateHeaderMode();
        java.lang.String str14 = cSVFormat8.getRecordSeparator();
        java.lang.Object obj15 = null;
        boolean boolean16 = cSVFormat8.equals(obj15);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat8.withTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode13 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode13.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        java.io.File file0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) '\\');
        char char8 = cSVFormat5.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withAllowMissingColumnNames(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse(file0, charset1, cSVFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: file");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\t' + "'", char8 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        boolean boolean3 = cSVFormat0.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withQuote((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withAllowDuplicateHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("", cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withCommentMarker((java.lang.Character) ' ');
        java.lang.String str12 = cSVFormat11.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse(reader0, cSVFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> CommentStart=< > NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str12, "Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> CommentStart=< > NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreEmptyLines();
        java.lang.String str8 = cSVFormat7.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat.Predefined predefined5 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv;
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, (-1.0d), predefined5, (short) 0 };
        java.lang.String str8 = cSVFormat0.format(objArray7);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withAllowMissingColumnNames();
        boolean boolean10 = cSVFormat0.getIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + predefined5 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv + "'", predefined5.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "false\t-1.0\tMongoDBTsv\t0" + "'", str8, "false\t-1.0\tMongoDBTsv\t0");
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.sql.ResultSet resultSet1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSet1);
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean4 = cSVFormat3.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withDelimiter('\t');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker((java.lang.Character) '#');
        boolean boolean9 = cSVFormat6.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean12 = cSVFormat11.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withSkipHeaderRecord();
        org.apache.commons.csv.CSVPrinter cSVPrinter16 = cSVFormat14.printer();
        java.lang.Appendable appendable17 = cSVPrinter16.getOut();
        cSVFormat2.print((java.lang.Object) cSVFormat10, appendable17, false);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat2.withCommentMarker((java.lang.Character) ' ');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVPrinter16);
        org.junit.Assert.assertNotNull(appendable17);
        org.junit.Assert.assertNotNull(cSVFormat21);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser6.spliterator();
        boolean boolean8 = cSVParser6.isClosed();
        boolean boolean9 = cSVParser6.hasHeaderComment();
        java.lang.String str10 = cSVParser6.getHeaderComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = builder2.build();
        org.apache.commons.csv.CSVFormat.Builder builder7 = builder2.setEscape('#');
        org.apache.commons.csv.CSVFormat.Builder builder9 = builder2.setDelimiter("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        java.lang.String str4 = cSVFormat3.getDelimiterString();
        java.lang.Object obj5 = null;
        boolean boolean6 = cSVFormat3.equals(obj5);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withQuote((java.lang.Character) '|');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t" + "'", str4, "\t");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withCommentMarker((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat3.withCommentMarker(',');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withNullString(",");
        java.lang.String[] strArray9 = cSVFormat8.getHeader();
        java.lang.String str10 = cSVFormat8.getDelimiterString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\t" + "'", str10, "\t");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser6.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser6.getRecords();
        java.util.List<java.lang.String> strList11 = cSVParser6.getHeaderNames();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator12 = cSVParser6.spliterator();
        long long13 = cSVParser6.getCurrentLineNumber();
        java.lang.String str14 = cSVParser6.getFirstEndOfLine();
        cSVParser6.close();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        boolean boolean5 = cSVFormat1.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withRecordSeparator("");
        boolean boolean8 = cSVFormat1.isCommentMarkerSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        boolean boolean5 = cSVFormat4.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withAllowMissingColumnNames(true);
        boolean boolean9 = cSVFormat8.isEscapeCharacterSet();
        java.lang.String[] strArray10 = cSVFormat8.getHeader();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse(reader0, cSVFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withHeader(strArray5);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat.Builder builder5 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat4);
        java.io.Reader reader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser7 = cSVFormat4.parse(reader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat5.withQuote(' ');
        java.sql.ResultSetMetaData resultSetMetaData13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat5.withHeader(resultSetMetaData13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withEscape('\"');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.QuoteMode quoteMode5 = cSVFormat4.getQuoteMode();
        org.apache.commons.csv.CSVPrinter cSVPrinter6 = cSVFormat4.printer();
        java.sql.ResultSet resultSet7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVPrinter6.printRecords(resultSet7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quoteMode5 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode5.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVPrinter6);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("", cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat.Builder builder12 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat11);
        java.sql.ResultSetMetaData resultSetMetaData13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withHeader(resultSetMetaData13);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat15.withIgnoreSurroundingSpaces(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser22 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat19, (long) 'a', (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        java.lang.String str4 = cSVFormat3.getDelimiterString();
        java.lang.Object obj5 = null;
        boolean boolean6 = cSVFormat3.equals(obj5);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean11 = cSVFormat9.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withAllowMissingColumnNames();
        org.apache.commons.csv.QuoteMode quoteMode14 = cSVFormat13.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withTrim();
        boolean boolean16 = cSVFormat3.equals((java.lang.Object) cSVFormat15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat15.withIgnoreEmptyLines(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t" + "'", str4, "\t");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + quoteMode14 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode14.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_CSV;
        java.lang.String str1 = cSVFormat0.toString();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withRecordSeparator("\t");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withTrim(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Delimiter=<,> QuoteChar=<\"> QuoteMode=<ALL_NON_NULL> NullString=<> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str1, "Delimiter=<,> QuoteChar=<\"> QuoteMode=<ALL_NON_NULL> NullString=<> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        boolean boolean5 = cSVFormat4.getAutoFlush();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = builder2.build();
        org.apache.commons.csv.CSVFormat.Builder builder7 = builder2.setEscape((java.lang.Character) '|');
        org.apache.commons.csv.CSVFormat.Builder builder9 = builder2.setAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setCommentMarker('\\');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat0.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        boolean boolean9 = cSVFormat8.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat.Builder builder10 = cSVFormat8.builder();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat8.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withCommentMarker('\"');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        boolean boolean7 = cSVParser6.isClosed();
        java.lang.String str8 = cSVParser6.getFirstEndOfLine();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList9 = cSVParser6.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator10 = cSVParser6.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(cSVRecordList9);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator10);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat.Builder builder12 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean15 = cSVFormat13.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat.Predefined predefined18 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv;
        java.lang.Object[] objArray20 = new java.lang.Object[] { false, (-1.0d), predefined18, (short) 0 };
        java.lang.String str21 = cSVFormat13.format(objArray20);
        org.apache.commons.csv.CSVFormat.Builder builder22 = cSVFormat13.builder();
        org.apache.commons.csv.CSVFormat.Builder builder24 = builder22.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        java.lang.String[] strArray32 = new java.lang.String[] { "\t", "hi!", "\n", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat25.withHeader(strArray32);
        org.apache.commons.csv.CSVFormat.Builder builder34 = builder24.setHeader(strArray32);
        org.apache.commons.csv.CSVFormat.Builder builder35 = builder12.setHeaderComments((java.lang.Object[]) strArray32);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + predefined18 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv + "'", predefined18.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "false\t-1.0\tMongoDBTsv\t0" + "'", str21, "false\t-1.0\tMongoDBTsv\t0");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean5 = cSVFormat3.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withTrailingDelimiter();
        boolean boolean7 = cSVFormat6.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withSkipHeaderRecord();
        char char10 = cSVFormat9.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        java.lang.String[] strArray13 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withHeader(strArray13);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat6.withHeaderComments((java.lang.Object[]) strArray13);
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder0.setHeaderComments(strArray13);
        org.apache.commons.csv.CSVFormat cSVFormat17 = builder0.build();
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder0.setIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\t' + "'", char10 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        boolean boolean9 = cSVFormat8.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat.Builder builder10 = cSVFormat8.builder();
        boolean boolean11 = cSVFormat8.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        boolean boolean2 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean3 = cSVFormat0.getAllowDuplicateHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat.Builder builder11 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat10);
        boolean boolean12 = cSVFormat10.getTrailingDelimiter();
        java.lang.Character char13 = cSVFormat10.getQuoteCharacter();
        boolean boolean14 = cSVFormat10.getAllowDuplicateHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(char13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        boolean boolean9 = cSVFormat8.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat.Builder builder10 = cSVFormat8.builder();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withEscape(',');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withAllowMissingColumnNames();
        java.sql.ResultSet resultSet14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withHeader(resultSet14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteChar=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) ',');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("", cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withIgnoreEmptyLines(true);
        java.lang.String str12 = cSVFormat6.getDelimiterString();
        org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse("\\N", cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat6.withAutoFlush(true);
        java.io.File file16 = null;
        java.nio.charset.Charset charset17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter18 = cSVFormat6.print(file16, charset17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t" + "'", str12, "\t");
        org.junit.Assert.assertNotNull(cSVParser13);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean2 = cSVFormat1.getSkipHeaderRecord();
        org.apache.commons.csv.QuoteMode quoteMode3 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withQuoteMode(quoteMode3);
        java.lang.String str5 = cSVFormat1.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrim();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, 1L, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + quoteMode3 + "' != '" + org.apache.commons.csv.QuoteMode.NON_NUMERIC + "'", quoteMode3.equals(org.apache.commons.csv.QuoteMode.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\t" + "'", str5, "\t");
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.sql.ResultSet resultSet1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSet1);
        java.sql.ResultSet resultSet3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withHeader(resultSet3);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.ORACLE;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        java.io.File file0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MONGODB_TSV;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withTrailingDelimiter();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse(file0, charset1, cSVFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: file");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        java.lang.String str4 = cSVFormat3.getDelimiterString();
        java.lang.Object obj5 = null;
        boolean boolean6 = cSVFormat3.equals(obj5);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withIgnoreSurroundingSpaces(true);
        boolean boolean13 = cSVFormat12.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withSkipHeaderRecord(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t" + "'", str4, "\t");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        java.sql.ResultSetMetaData resultSetMetaData5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withHeader(resultSetMetaData5);
        java.lang.String str7 = cSVFormat6.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withCommentMarker('\"');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withTrim();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: url");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\N" + "'", str7, "\\N");
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        org.apache.commons.csv.CSVFormat.Builder builder1 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder3 = builder1.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder5 = builder3.setTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat.Builder builder7 = builder5.setAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = builder5.build();
        org.apache.commons.csv.CSVFormat cSVFormat9 = builder5.build();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withSkipHeaderRecord();
        org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse("", cSVFormat10);
        org.apache.commons.csv.CSVPrinter cSVPrinter12 = cSVFormat10.printer();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVParser11);
        org.junit.Assert.assertNotNull(cSVPrinter12);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withAllowMissingColumnNames();
        java.lang.String str7 = cSVFormat6.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withRecordSeparator("\t");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuote('4');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withSystemRecordSeparator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: url");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat.Builder builder9 = cSVFormat6.builder();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setAutoFlush(false);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setRecordSeparator('\"');
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setRecordSeparator('#');
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder15.setCommentMarker((java.lang.Character) ' ');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        java.lang.String str4 = cSVFormat3.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder5 = cSVFormat3.builder();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withTrim(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t" + "'", str4, "\t");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        boolean boolean9 = cSVFormat8.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat.Builder builder10 = cSVFormat8.builder();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withSkipHeaderRecord(false);
        java.lang.String str13 = cSVFormat12.getDelimiterString();
        java.sql.ResultSet resultSet14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withHeader(resultSet14);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat12.withTrailingDelimiter();
        java.lang.String str18 = cSVFormat12.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat12.withAllowMissingColumnNames(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t" + "'", str13, "\t");
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\\N" + "'", str18, "\\N");
        org.junit.Assert.assertNotNull(cSVFormat20);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withTrim();
        org.apache.commons.csv.CSVFormat.Builder builder9 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat5);
        java.lang.Character char10 = cSVFormat5.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(char10);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat.Builder builder9 = cSVFormat6.builder();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setAutoFlush(false);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder9.setEscape((java.lang.Character) '|');
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setAllowDuplicateHeaderNames(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat.Builder builder3 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withAllowDuplicateHeaderNames(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = predefined0.getFormat();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.RFC4180 + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.RFC4180));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        java.lang.String str4 = cSVFormat3.getDelimiterString();
        java.lang.Object obj5 = null;
        boolean boolean6 = cSVFormat3.equals(obj5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withIgnoreEmptyLines(true);
        boolean boolean9 = cSVFormat3.getAllowDuplicateHeaderNames();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode10 = cSVFormat3.getDuplicateHeaderMode();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t" + "'", str4, "\t");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode10 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode10.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withNullString("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser6.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser6.getRecords();
        java.util.List<java.lang.String> strList11 = cSVParser6.getHeaderNames();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator12 = cSVParser6.spliterator();
        long long13 = cSVParser6.getCurrentLineNumber();
        boolean boolean14 = cSVParser6.hasTrailerComment();
        java.lang.String str15 = cSVParser6.getTrailerComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        java.lang.String str4 = cSVFormat3.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder5 = cSVFormat3.builder();
        org.apache.commons.csv.CSVFormat.Builder builder7 = builder5.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder9 = builder7.setRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setSkipHeaderRecord(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t" + "'", str4, "\t");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = builder2.build();
        org.apache.commons.csv.CSVFormat.Builder builder7 = builder2.setEscape('#');
        org.apache.commons.csv.CSVFormat.Builder builder9 = builder2.setCommentMarker((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = builder9.build();
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder9.setAutoFlush(false);
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder9.setCommentMarker((java.lang.Character) '|');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        boolean boolean9 = cSVFormat8.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat.Builder builder10 = cSVFormat8.builder();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withEscape(',');
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode13 = cSVFormat8.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean16 = cSVFormat14.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withTrailingDelimiter();
        boolean boolean18 = cSVFormat17.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withSkipHeaderRecord();
        char char21 = cSVFormat20.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat20.withIgnoreSurroundingSpaces(true);
        java.lang.String[] strArray24 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withHeader(strArray24);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat17.withHeaderComments((java.lang.Object[]) strArray24);
        java.lang.String str27 = cSVFormat8.format((java.lang.Object[]) strArray24);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode13 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode13.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\t' + "'", char21 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        boolean boolean8 = cSVParser6.isClosed();
        java.util.List<java.lang.String> strList9 = cSVParser6.getHeaderNames();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator10 = cSVParser6.spliterator();
        cSVParser6.close();
        long long12 = cSVParser6.getRecordNumber();
        java.lang.String str13 = cSVParser6.getFirstEndOfLine();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        java.io.InputStream inputStream0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        boolean boolean6 = cSVFormat5.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat.Builder builder8 = cSVFormat7.builder();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withSkipHeaderRecord();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse(inputStream0, charset1, cSVFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: inputStream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.QuoteMode quoteMode5 = cSVFormat4.getQuoteMode();
        org.apache.commons.csv.CSVPrinter cSVPrinter6 = cSVFormat4.printer();
        java.lang.Object obj7 = null;
        cSVPrinter6.print(obj7);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quoteMode5 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode5.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVPrinter6);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean13 = cSVFormat11.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withAllowMissingColumnNames();
        org.apache.commons.csv.QuoteMode quoteMode16 = cSVFormat15.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat8.withQuoteMode(quoteMode16);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat8.withSystemRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + quoteMode16 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode16.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) 100, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser6.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser6.getRecords();
        boolean boolean11 = cSVParser6.isClosed();
        java.lang.String str12 = cSVParser6.getHeaderComment();
        long long13 = cSVParser6.getCurrentLineNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator14 = cSVParser6.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator14);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withEscape('\\');
        java.lang.Character char11 = cSVFormat10.getQuoteCharacter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(char11);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withQuote('\"');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        boolean boolean7 = cSVFormat6.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        boolean boolean10 = cSVFormat9.isEscapeCharacterSet();
        boolean boolean11 = cSVFormat9.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withSkipHeaderRecord();
        char char7 = cSVFormat6.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreSurroundingSpaces(true);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withHeader(strArray10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeaderComments((java.lang.Object[]) strArray10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat3.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat.Builder builder14 = cSVFormat3.builder();
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder14.setIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\t' + "'", char7 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_CSV;
        java.lang.String str1 = cSVFormat0.toString();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(false);
        java.lang.String[] strArray4 = cSVFormat3.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Delimiter=<,> QuoteChar=<\"> QuoteMode=<ALL_NON_NULL> NullString=<> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str1, "Delimiter=<,> QuoteChar=<\"> QuoteMode=<ALL_NON_NULL> NullString=<> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(strArray4);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false HeaderComments:[,, Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false, false,-1.0,MongoDBTsv,0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.Delimiter=<?> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<?> SkipHeaderRecord:false HeaderComments:[,, Delimiter=<?> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<?> SkipHeaderRecord:false, false,-1.0,MongoDBTsv,0]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser6.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser6.getRecords();
        java.lang.String str11 = cSVParser6.getHeaderComment();
        long long12 = cSVParser6.getRecordNumber();
        java.lang.String str13 = cSVParser6.getFirstEndOfLine();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.ORACLE;
        boolean boolean1 = cSVFormat0.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withAutoFlush(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('|');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat5, (long) 10, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        boolean boolean3 = cSVFormat0.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withQuote((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAutoFlush(true);
        boolean boolean8 = cSVFormat5.getAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser6.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser6.getRecords();
        long long11 = cSVParser6.getCurrentLineNumber();
        java.lang.String str12 = cSVParser6.getTrailerComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat.Builder builder3 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat1);
        java.lang.String str4 = cSVFormat1.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:true" + "'", str4, "Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:true");
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.QuoteMode quoteMode6 = cSVFormat5.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean10 = cSVFormat8.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withHeader(resultSetMetaData15);
        org.apache.commons.csv.CSVFormat.Builder builder17 = cSVFormat14.builder();
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder17.setAutoFlush(false);
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder19.setRecordSeparator('\"');
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean24 = cSVFormat22.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat.Predefined predefined27 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv;
        java.lang.Object[] objArray29 = new java.lang.Object[] { false, (-1.0d), predefined27, (short) 0 };
        java.lang.String str30 = cSVFormat22.format(objArray29);
        org.apache.commons.csv.CSVFormat.Builder builder31 = cSVFormat22.builder();
        org.apache.commons.csv.CSVFormat.Builder builder33 = builder31.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        java.lang.String[] strArray41 = new java.lang.String[] { "\t", "hi!", "\n", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat34.withHeader(strArray41);
        org.apache.commons.csv.CSVFormat.Builder builder43 = builder33.setHeader(strArray41);
        org.apache.commons.csv.CSVFormat.Builder builder44 = builder21.setHeaderComments(strArray41);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat7.withHeaderComments((java.lang.Object[]) strArray41);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser46 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + quoteMode6 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode6.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + predefined27 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv + "'", predefined27.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv));
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "false\t-1.0\tMongoDBTsv\t0" + "'", str30, "false\t-1.0\tMongoDBTsv\t0");
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(cSVFormat45);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withFirstRecordAsHeader();
        java.sql.ResultSetMetaData resultSetMetaData6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withHeader(resultSetMetaData6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withEscape(',');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withNullString("#\t\thi!\t#n\t#n");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\t');
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser6.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser6.getRecords();
        long long11 = cSVParser6.getCurrentLineNumber();
        cSVParser6.close();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator13 = cSVParser6.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator13);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuote((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withAllowDuplicateHeaderNames(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        java.nio.file.Path path0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAutoFlush(true);
        java.lang.String[] strArray5 = cSVFormat2.getHeader();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse(path0, charset1, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: path");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(false);
        java.lang.String str11 = cSVFormat8.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withCommentMarker((java.lang.Character) ' ');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\N" + "'", str11, "\\N");
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withAllowDuplicateHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        java.lang.String str4 = cSVFormat3.getDelimiterString();
        boolean boolean5 = cSVFormat3.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.QuoteMode quoteMode8 = org.apache.commons.csv.QuoteMode.MINIMAL;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withQuoteMode(quoteMode8);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withSystemRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t" + "'", str4, "\t");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + quoteMode8 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode8.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder6.setCommentMarker((java.lang.Character) ' ');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withRecordSeparator(",");
        char char9 = cSVFormat8.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\t' + "'", char9 == '\t');
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        boolean boolean8 = cSVFormat1.isNullStringSet();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false HeaderComments:[,, Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false, false,-1.0,MongoDBTsv,0]", cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cSVParser9);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat0.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withTrim(false);
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode9 = cSVFormat8.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withAllowDuplicateHeaderNames(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode9 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode9.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.lang.String str1 = cSVFormat0.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str1, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote('a');
        boolean boolean5 = cSVFormat4.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.Delimiter=<,> QuoteChar=<\"> RecordSeparator=<??> SkipHeaderRecord:false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        boolean boolean3 = cSVFormat0.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withQuote((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreSurroundingSpaces(true);
        java.nio.file.Path path8 = null;
        java.nio.charset.Charset charset9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter10 = cSVFormat5.print(path8, charset9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        java.nio.file.Path path0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withAutoFlush(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse(path0, charset1, cSVFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: path");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        boolean boolean9 = cSVFormat8.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat.Builder builder10 = cSVFormat8.builder();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withSkipHeaderRecord(false);
        java.lang.String str13 = cSVFormat12.getDelimiterString();
        java.sql.ResultSet resultSet14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withHeader(resultSet14);
        java.lang.String[] strArray16 = cSVFormat15.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t" + "'", str13, "\t");
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.QuoteMode quoteMode5 = cSVFormat4.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withAllowDuplicateHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quoteMode5 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode5.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withNullString("\nfalse\t-1.0\tMongoDBTsv\t0");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        java.lang.String[] strArray8 = cSVFormat1.getHeaderComments();
        java.lang.Character char9 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat1.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat1.withCommentMarker((java.lang.Character) '4');
        java.lang.String str14 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVParser cSVParser15 = org.apache.commons.csv.CSVParser.parse("\\N", cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(char9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\N" + "'", str14, "\\N");
        org.junit.Assert.assertNotNull(cSVParser15);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        boolean boolean9 = cSVFormat8.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat.Builder builder10 = cSVFormat8.builder();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withEscape(',');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withAllowMissingColumnNames();
        java.sql.ResultSet resultSet14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withHeader(resultSet14);
        boolean boolean16 = cSVFormat13.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.MySQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = predefined0.getFormat();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MySQL + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.MySQL));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        boolean boolean3 = cSVFormat1.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase();
        boolean boolean6 = cSVFormat5.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withEscape((java.lang.Character) '4');
        boolean boolean12 = cSVFormat5.getIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser6.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser6.getRecords();
        boolean boolean11 = cSVParser6.isClosed();
        java.lang.String str12 = cSVParser6.getHeaderComment();
        boolean boolean13 = cSVParser6.hasHeaderComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreHeaderCase();
        boolean boolean10 = cSVFormat9.getTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape((java.lang.Character) '4');
        boolean boolean7 = cSVFormat6.isEscapeCharacterSet();
        boolean boolean8 = cSVFormat6.getAllowDuplicateHeaderNames();
        java.lang.String[] strArray9 = cSVFormat6.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat.Builder builder11 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat10);
        java.sql.ResultSetMetaData resultSetMetaData12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withHeader(resultSetMetaData12);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withAllowMissingColumnNames(true);
        java.nio.file.Path path19 = null;
        java.nio.charset.Charset charset20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter21 = cSVFormat16.print(path19, charset20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(resultSetMetaData4);
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("\nfalse\t-1.0\tMongoDBTsv\t0", cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean2 = cSVFormat1.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withSkipHeaderRecord();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse(reader0, cSVFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat.Builder builder9 = cSVFormat6.builder();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setAutoFlush(false);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setRecordSeparator('\"');
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setTrim(false);
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder13.setQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder17.setIgnoreEmptyLines(false);
        java.lang.Class<?> wildcardClass20 = builder19.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote('a');
        org.apache.commons.csv.CSVFormat.Builder builder5 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat0);
        java.lang.String[] strArray6 = cSVFormat0.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(strArray6);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat5.withQuote(' ');
        boolean boolean13 = cSVFormat12.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withSkipHeaderRecord();
        boolean boolean15 = cSVFormat14.isEscapeCharacterSet();
        boolean boolean16 = cSVFormat14.isCommentMarkerSet();
        java.lang.String str17 = cSVFormat14.toString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Delimiter=<\t> Escape=<\\> QuoteChar=< > QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:true" + "'", str17, "Delimiter=<\t> Escape=<\\> QuoteChar=< > QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:true");
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        java.lang.String str8 = cSVParser6.getTrailerComment();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser6.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser6.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: url");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.ORACLE;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote('\\');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withFirstRecordAsHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        java.io.File file0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        boolean boolean5 = cSVFormat2.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuote((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreEmptyLines(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse(file0, charset1, cSVFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: file");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat.Predefined predefined5 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv;
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, (-1.0d), predefined5, (short) 0 };
        java.lang.String str8 = cSVFormat0.format(objArray7);
        org.apache.commons.csv.CSVFormat.Builder builder9 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setNullString("");
        java.sql.ResultSet resultSet12 = null;
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder9.setHeader(resultSet12);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + predefined5 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv + "'", predefined5.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "false\t-1.0\tMongoDBTsv\t0" + "'", str8, "false\t-1.0\tMongoDBTsv\t0");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        java.nio.file.Path path0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        char char4 = cSVFormat3.getDelimiter();
        boolean boolean5 = cSVFormat3.getAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean8 = cSVFormat6.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuote((java.lang.Character) '\\');
        boolean boolean12 = cSVFormat3.equals((java.lang.Object) cSVFormat9);
        boolean boolean13 = cSVFormat9.isQuoteCharacterSet();
        boolean boolean14 = cSVFormat9.getAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat9.withSkipHeaderRecord(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser17 = org.apache.commons.csv.CSVParser.parse(path0, charset1, cSVFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: path");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\t' + "'", char4 == '\t');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withAutoFlush(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_TSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter(false);
        java.lang.String str3 = cSVFormat0.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Delimiter=<\t> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str3, "Delimiter=<\t> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        java.lang.String[] strArray2 = cSVFormat1.getHeaderComments();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentMarker('\\');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start and the escape character cannot be the same ('\\')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator(' ');
        java.lang.String str10 = cSVFormat9.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\N" + "'", str10, "\\N");
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withDelimiter('\t');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        boolean boolean6 = cSVFormat5.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withTrailingDelimiter(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAutoFlush();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode5 = cSVFormat3.getDuplicateHeaderMode();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode5 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode5.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuote((java.lang.Character) '\\');
        char char7 = cSVFormat4.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withTrim(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse(reader0, cSVFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\t' + "'", char7 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withIgnoreHeaderCase(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setTrim(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase(true);
        java.lang.Character char6 = cSVFormat5.getQuoteCharacter();
        boolean boolean7 = cSVFormat5.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withRecordSeparator("");
        java.lang.String str10 = cSVFormat5.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> IgnoreHeaderCase:ignored SkipHeaderRecord:false" + "'", str10, "Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> IgnoreHeaderCase:ignored SkipHeaderRecord:false");
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        boolean boolean5 = cSVFormat0.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withEscape((java.lang.Character) '\\');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        boolean boolean9 = cSVFormat8.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat.Builder builder10 = cSVFormat8.builder();
        org.apache.commons.csv.CSVFormat.Builder builder11 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat8);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withQuote(' ');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser6.getRecords();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream8 = cSVParser6.stream();
        long long9 = cSVParser6.getCurrentLineNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator10 = cSVParser6.spliterator();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream11 = cSVParser6.stream();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertNotNull(cSVRecordStream8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator10);
        org.junit.Assert.assertNotNull(cSVRecordStream11);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuote((java.lang.Character) '\\');
        char char7 = cSVFormat4.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withAllowMissingColumnNames(true);
        boolean boolean14 = cSVFormat9.isQuoteCharacterSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser17 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat9, (long) '\"', (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\t' + "'", char7 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('4');
        java.lang.String str9 = cSVFormat6.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withIgnoreHeaderCase(false);
        java.sql.ResultSetMetaData resultSetMetaData12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat6.withHeader(resultSetMetaData12);
        java.lang.String[] strArray14 = cSVFormat13.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\N" + "'", str9, "\\N");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withEscape((java.lang.Character) '|');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        java.lang.String str5 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withRecordSeparator("\t");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> CommentStart=< > NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withIgnoreHeaderCase(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean2 = cSVFormat1.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withFirstRecordAsHeader();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse(reader0, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrailingDelimiter();
        boolean boolean7 = cSVFormat5.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withAllowDuplicateHeaderNames(true);
        java.lang.Character char12 = cSVFormat9.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withRecordSeparator('\"');
        boolean boolean15 = cSVFormat14.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(char12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase();
        boolean boolean6 = cSVFormat5.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withQuote('\"');
        java.lang.String str9 = cSVFormat8.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Delimiter=<\t> Escape=<\\> QuoteChar=<\"> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> IgnoreHeaderCase:ignored SkipHeaderRecord:false" + "'", str9, "Delimiter=<\t> Escape=<\\> QuoteChar=<\"> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> IgnoreHeaderCase:ignored SkipHeaderRecord:false");
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        java.util.List<java.lang.String> strList9 = cSVParser6.getHeaderNames();
        java.util.Spliterator<java.lang.String> strSpliterator10 = strList9.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator11 = strList9.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator12 = strList9.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator13 = strList9.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strSpliterator10);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertNotNull(strSpliterator13);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        java.io.InputStream inputStream0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        java.lang.String str6 = cSVFormat5.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder7 = cSVFormat5.builder();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse(inputStream0, charset1, cSVFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: inputStream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\t" + "'", str6, "\t");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat.Builder builder3 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat1);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuote((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSystemRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf(",\tDelimiter=<\\\t> Escape=<\\\\> QuoteMode=<ALL_NON_NULL> NullString=<\\\\N> RecordSeparator=<\\n> SkipHeaderRecord:false\tfalse,-1.0,MongoDBTsv,0\t");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.,?Delimiter=<\\?> Escape=<\\\\> QuoteMode=<ALL_NON_NULL> NullString=<\\\\N> RecordSeparator=<\\n> SkipHeaderRecord:false?false,-1.0,MongoDBTsv,0?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_TSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withTrailingDelimiter();
        java.lang.Character char4 = cSVFormat2.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(char4);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withIgnoreHeaderCase(true);
        java.sql.ResultSetMetaData resultSetMetaData12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withHeader(resultSetMetaData12);
        org.apache.commons.csv.CSVFormat.Builder builder14 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withSkipHeaderRecord();
        char char7 = cSVFormat6.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreSurroundingSpaces(true);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withHeader(strArray10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeaderComments((java.lang.Object[]) strArray10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat3.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat.Builder builder14 = cSVFormat3.builder();
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder14.setCommentMarker((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat.Builder builder18 = builder16.setQuote('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\t' + "'", char7 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withAllowDuplicateHeaderNames(false);
        char char12 = cSVFormat8.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\t' + "'", char12 == '\t');
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean6 = cSVFormat4.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat.Predefined predefined9 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv;
        java.lang.Object[] objArray11 = new java.lang.Object[] { false, (-1.0d), predefined9, (short) 0 };
        java.lang.String str12 = cSVFormat4.format(objArray11);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat2.withHeaderComments(objArray11);
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + predefined9 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv + "'", predefined9.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "false\t-1.0\tMongoDBTsv\t0" + "'", str12, "false\t-1.0\tMongoDBTsv\t0");
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreSurroundingSpaces(true);
        boolean boolean7 = cSVFormat6.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withQuote((java.lang.Character) '#');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        java.lang.String str8 = cSVParser6.getFirstEndOfLine();
        java.lang.String str9 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cSVParser6.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strMap10);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        boolean boolean3 = cSVFormat1.getAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean6 = cSVFormat4.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuote((java.lang.Character) '\\');
        boolean boolean10 = cSVFormat1.equals((java.lang.Object) cSVFormat7);
        boolean boolean11 = cSVFormat7.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat7.withQuote((java.lang.Character) ',');
        java.io.File file14 = null;
        java.nio.charset.Charset charset15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter16 = cSVFormat7.print(file14, charset15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat.Builder builder11 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat10);
        java.sql.ResultSetMetaData resultSetMetaData12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withHeader(resultSetMetaData12);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuote((java.lang.Character) 'a');
        java.lang.String str17 = cSVFormat14.getDelimiterString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\t" + "'", str17, "\t");
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        boolean boolean7 = cSVFormat6.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        java.lang.String str4 = cSVFormat3.getDelimiterString();
        java.lang.Object obj5 = null;
        boolean boolean6 = cSVFormat3.equals(obj5);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat3.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreEmptyLines(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t" + "'", str4, "\t");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat.Builder builder5 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat4);
        boolean boolean6 = cSVFormat4.isNullStringSet();
        java.lang.Character char7 = cSVFormat4.getQuoteCharacter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(char7);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        java.lang.String str5 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withRecordSeparator("\t");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuote('4');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withSkipHeaderRecord(false);
        boolean boolean13 = cSVFormat12.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withTrim();
        java.sql.ResultSetMetaData resultSetMetaData11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withHeader(resultSetMetaData11);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withIgnoreHeaderCase(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLText;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        java.lang.Class<?> wildcardClass2 = predefined0.getClass();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLText + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLText));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withQuote((java.lang.Character) '\"');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        boolean boolean4 = cSVFormat1.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withIgnoreSurroundingSpaces(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse(reader0, cSVFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        boolean boolean9 = cSVFormat8.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat.Builder builder10 = cSVFormat8.builder();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withSkipHeaderRecord(false);
        java.lang.String str13 = cSVFormat12.getDelimiterString();
        java.sql.ResultSet resultSet14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withHeader(resultSet14);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withTrim();
        boolean boolean17 = cSVFormat12.getAllowDuplicateHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t" + "'", str13, "\t");
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser6.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser6.getRecords();
        java.util.List<java.lang.String> strList11 = cSVParser6.getHeaderNames();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator12 = cSVParser6.spliterator();
        long long13 = cSVParser6.getCurrentLineNumber();
        java.lang.String str14 = cSVParser6.getFirstEndOfLine();
        java.lang.String str15 = cSVParser6.getTrailerComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        java.lang.String str5 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withRecordSeparator("\t");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> CommentStart=< > NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        java.lang.String str10 = cSVFormat9.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> CommentStart=< > NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str10, "Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> CommentStart=< > NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean2 = cSVFormat1.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withDelimiter('\t');
        java.lang.String str5 = cSVFormat4.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withTrim(true);
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse(",", cSVFormat7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withRecordSeparator("\n");
        boolean boolean11 = cSVFormat10.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\t" + "'", str5, "\t");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        boolean boolean4 = cSVFormat3.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withAllowDuplicateHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        java.lang.String str8 = cSVParser6.getTrailerComment();
        cSVParser6.close();
        long long10 = cSVParser6.getCurrentLineNumber();
        java.util.List<java.lang.String> strList11 = cSVParser6.getHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.lang.String str7 = cSVFormat6.getRecordSeparator();
        boolean boolean8 = cSVFormat6.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withIgnoreHeaderCase(true);
        java.lang.String str9 = cSVFormat8.getDelimiterString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t" + "'", str9, "\t");
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        org.apache.commons.csv.CSVFormat.Builder builder1 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder3 = builder1.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder5 = builder3.setTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat.Builder builder7 = builder5.setAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = builder5.build();
        org.apache.commons.csv.CSVFormat cSVFormat9 = builder5.build();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withSkipHeaderRecord();
        org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse("", cSVFormat10);
        java.lang.String str12 = cSVParser11.getTrailerComment();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor13 = cSVParser11.iterator();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVParser11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(cSVRecordItor13);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        java.lang.String str8 = cSVParser6.getTrailerComment();
        cSVParser6.close();
        long long10 = cSVParser6.getCurrentLineNumber();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cSVParser6.getHeaderMap();
        cSVParser6.close();
        long long13 = cSVParser6.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat.Predefined predefined5 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv;
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, (-1.0d), predefined5, (short) 0 };
        java.lang.String str8 = cSVFormat0.format(objArray7);
        org.apache.commons.csv.CSVFormat.Builder builder9 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        java.lang.String[] strArray19 = new java.lang.String[] { "\t", "hi!", "\n", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat12.withHeader(strArray19);
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder11.setHeader(strArray19);
        org.apache.commons.csv.CSVFormat.Builder builder23 = builder11.setAutoFlush(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + predefined5 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv + "'", predefined5.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "false\t-1.0\tMongoDBTsv\t0" + "'", str8, "false\t-1.0\tMongoDBTsv\t0");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        boolean boolean7 = cSVParser6.isClosed();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser6.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser6.spliterator();
        cSVParser6.close();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVRecordItor8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withCommentMarker((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withTrim(false);
        boolean boolean10 = cSVFormat3.getTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVPrinter cSVPrinter13 = cSVFormat12.printer();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVPrinter13);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        boolean boolean1 = cSVFormat0.isCommentMarkerSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser6.getRecords();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream8 = cSVParser6.stream();
        long long9 = cSVParser6.getCurrentLineNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator10 = cSVParser6.spliterator();
        boolean boolean11 = cSVParser6.isClosed();
        long long12 = cSVParser6.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertNotNull(cSVRecordStream8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        java.util.List<java.lang.String> strList9 = cSVParser6.getHeaderNames();
        boolean boolean10 = cSVParser6.hasTrailerComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        boolean boolean5 = cSVFormat3.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withTrim();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter('\\');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The escape character and the delimiter cannot be the same ('\\')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        java.lang.String str5 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withRecordSeparator("\t");
        java.io.File file8 = null;
        java.nio.charset.Charset charset9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter10 = cSVFormat4.print(file8, charset9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        boolean boolean7 = cSVParser6.isClosed();
        java.lang.String str8 = cSVParser6.getHeaderComment();
        java.util.List<java.lang.String> strList9 = cSVParser6.getHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean5 = cSVFormat3.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withTrailingDelimiter();
        boolean boolean7 = cSVFormat6.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withSkipHeaderRecord();
        char char10 = cSVFormat9.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        java.lang.String[] strArray13 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withHeader(strArray13);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat6.withHeaderComments((java.lang.Object[]) strArray13);
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder0.setHeaderComments(strArray13);
        org.apache.commons.csv.CSVFormat.Builder builder18 = builder16.setNullString("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\t' + "'", char10 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat0.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean8 = cSVFormat7.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withSkipHeaderRecord();
        org.apache.commons.csv.CSVPrinter cSVPrinter12 = cSVFormat10.printer();
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean16 = cSVFormat14.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser19 = org.apache.commons.csv.CSVParser.parse("", cSVFormat18);
        java.lang.String str20 = cSVParser19.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = cSVParser19.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator22 = cSVParser19.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList23 = cSVParser19.getRecords();
        long long24 = cSVParser19.getCurrentLineNumber();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream25 = cSVParser19.stream();
        cSVPrinter12.printRecord(cSVRecordStream25);
        boolean boolean27 = cSVFormat6.equals((java.lang.Object) cSVPrinter12);
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean30 = cSVFormat28.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat28.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat28.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData35 = null;
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withHeader(resultSetMetaData35);
        org.apache.commons.csv.CSVFormat.Builder builder37 = cSVFormat34.builder();
        org.apache.commons.csv.CSVFormat.Builder builder39 = builder37.setAutoFlush(false);
        org.apache.commons.csv.CSVFormat.Builder builder41 = builder39.setRecordSeparator('\"');
        org.apache.commons.csv.CSVFormat cSVFormat42 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean44 = cSVFormat42.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat.Predefined predefined47 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv;
        java.lang.Object[] objArray49 = new java.lang.Object[] { false, (-1.0d), predefined47, (short) 0 };
        java.lang.String str50 = cSVFormat42.format(objArray49);
        org.apache.commons.csv.CSVFormat.Builder builder51 = cSVFormat42.builder();
        org.apache.commons.csv.CSVFormat.Builder builder53 = builder51.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat54 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat54.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        java.lang.String[] strArray61 = new java.lang.String[] { "\t", "hi!", "\n", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat54.withHeader(strArray61);
        org.apache.commons.csv.CSVFormat.Builder builder63 = builder53.setHeader(strArray61);
        org.apache.commons.csv.CSVFormat.Builder builder64 = builder41.setHeaderComments(strArray61);
        cSVPrinter12.print((java.lang.Object) builder64);
        cSVPrinter12.println();
        cSVPrinter12.flush();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVPrinter12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVParser19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator22);
        org.junit.Assert.assertNotNull(cSVRecordList23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertNotNull(cSVRecordStream25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + predefined47 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv + "'", predefined47.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv));
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "false\t-1.0\tMongoDBTsv\t0" + "'", str50, "false\t-1.0\tMongoDBTsv\t0");
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder64);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = predefined0.getFormat();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("", cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withIgnoreEmptyLines(true);
        java.lang.String str12 = cSVFormat6.getDelimiterString();
        org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse("\\N", cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat6.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withNullString("\n");
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat17.withTrailingDelimiter();
        java.lang.String str19 = cSVFormat18.getDelimiterString();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t" + "'", str12, "\t");
        org.junit.Assert.assertNotNull(cSVParser13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\t" + "'", str19, "\t");
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setIgnoreHeaderCase(false);
        java.sql.ResultSet resultSet5 = null;
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setHeader(resultSet5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setDelimiter("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The delimiter cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        java.util.List<java.lang.String> strList9 = cSVParser6.getHeaderNames();
        java.lang.String str10 = cSVParser6.getFirstEndOfLine();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cSVParser6.getHeaderMap();
        boolean boolean12 = cSVParser6.hasTrailerComment();
        java.lang.String str13 = cSVParser6.getTrailerComment();
        java.lang.String str14 = cSVParser6.getTrailerComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape((java.lang.Character) '4');
        java.lang.String str7 = cSVFormat6.getDelimiterString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\t" + "'", str7, "\t");
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat.Builder builder3 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat1);
        org.apache.commons.csv.CSVFormat.Builder builder5 = builder3.setIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreSurroundingSpaces(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        java.lang.String str1 = cSVFormat0.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withCommentMarker((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withRecordSeparator("false\t-1.0\tMongoDBTsv\t0");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator("\\\t\thi!\t\\n\t\\n");
        java.lang.String str8 = cSVFormat7.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\N" + "'", str1, "\\N");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\\\t\thi!\t\\n\t\\n> SkipHeaderRecord:false" + "'", str8, "Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\\\t\thi!\t\\n\t\\n> SkipHeaderRecord:false");
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAutoFlush(true);
        boolean boolean3 = cSVFormat0.isQuoteCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setSkipHeaderRecord(true);
        java.sql.ResultSet resultSet3 = null;
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setHeader(resultSet3);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setQuote((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setIgnoreSurroundingSpaces(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat.Predefined predefined5 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv;
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, (-1.0d), predefined5, (short) 0 };
        java.lang.String str8 = cSVFormat0.format(objArray7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withCommentMarker((java.lang.Character) ' ');
        java.lang.String str11 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + predefined5 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv + "'", predefined5.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "false\t-1.0\tMongoDBTsv\t0" + "'", str8, "false\t-1.0\tMongoDBTsv\t0");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t" + "'", str11, "\t");
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat.Predefined predefined5 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv;
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, (-1.0d), predefined5, (short) 0 };
        java.lang.String str8 = cSVFormat0.format(objArray7);
        org.apache.commons.csv.CSVFormat.Builder builder9 = cSVFormat0.builder();
        java.lang.String[] strArray16 = new java.lang.String[] { "false\t-1.0\tMongoDBTsv\t0", "\n", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false", "Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false", "false,-1.0,MongoDBTsv,0", "" };
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder9.setHeaderComments(strArray16);
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder17.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder17.setCommentMarker('\t');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + predefined5 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv + "'", predefined5.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "false\t-1.0\tMongoDBTsv\t0" + "'", str8, "false\t-1.0\tMongoDBTsv\t0");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote('a');
        boolean boolean3 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase(true);
        java.lang.Character char6 = cSVFormat5.getQuoteCharacter();
        boolean boolean7 = cSVFormat5.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withRecordSeparator("");
        java.lang.Class<?> wildcardClass10 = cSVFormat9.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        java.lang.String str4 = cSVFormat3.getDelimiterString();
        java.lang.Object obj5 = null;
        boolean boolean6 = cSVFormat3.equals(obj5);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat3.withSkipHeaderRecord();
        java.lang.String str12 = cSVFormat11.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t" + "'", str4, "\t");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat.Builder builder11 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat10);
        java.sql.ResultSetMetaData resultSetMetaData12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withHeader(resultSetMetaData12);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withQuote('a');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat.Builder builder11 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat10);
        java.sql.ResultSetMetaData resultSetMetaData12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withHeader(resultSetMetaData12);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuote((java.lang.Character) 'a');
        java.io.File file17 = null;
        java.nio.charset.Charset charset18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter19 = cSVFormat16.print(file17, charset18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat.Predefined predefined5 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv;
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, (-1.0d), predefined5, (short) 0 };
        java.lang.String str8 = cSVFormat0.format(objArray7);
        org.apache.commons.csv.CSVFormat.Builder builder9 = cSVFormat0.builder();
        java.lang.String[] strArray16 = new java.lang.String[] { "false\t-1.0\tMongoDBTsv\t0", "\n", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false", "Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false", "false,-1.0,MongoDBTsv,0", "" };
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder9.setHeaderComments(strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withSkipHeaderRecord();
        char char20 = cSVFormat19.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat19.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean31 = cSVFormat29.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat29.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat29.withAllowMissingColumnNames();
        org.apache.commons.csv.QuoteMode quoteMode34 = cSVFormat33.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat26.withQuoteMode(quoteMode34);
        org.apache.commons.csv.CSVFormat.Builder builder36 = builder9.setQuoteMode(quoteMode34);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + predefined5 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv + "'", predefined5.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "false\t-1.0\tMongoDBTsv\t0" + "'", str8, "false\t-1.0\tMongoDBTsv\t0");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\t' + "'", char20 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertTrue("'" + quoteMode34 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode34.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowDuplicateHeaderNames();
        java.sql.ResultSet resultSet2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withHeader(resultSet2);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withNullString("\\N");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withNullString("Delimiter=<,> QuoteChar=<\"> QuoteMode=<ALL_NON_NULL> NullString=<> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape((java.lang.Character) '4');
        boolean boolean7 = cSVFormat6.isEscapeCharacterSet();
        boolean boolean8 = cSVFormat6.getAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withCommentMarker('\\');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withNullString("Delimiter=<\t> Escape=<4> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase();
        boolean boolean6 = cSVFormat5.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withTrim();
        boolean boolean10 = cSVFormat9.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat.Builder builder11 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat9);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setIgnoreEmptyLines(true);
        java.sql.ResultSetMetaData resultSetMetaData14 = null;
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder11.setHeader(resultSetMetaData14);
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder11.setAutoFlush(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat.Predefined predefined5 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv;
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, (-1.0d), predefined5, (short) 0 };
        java.lang.String str8 = cSVFormat0.format(objArray7);
        org.apache.commons.csv.CSVFormat.Builder builder9 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder9.setQuote('\"');
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setNullString("Delimiter=<\t> Escape=<\\> QuoteChar=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder13.setRecordSeparator("\\\t\thi!\t\\n\t\\n\t");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + predefined5 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv + "'", predefined5.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "false\t-1.0\tMongoDBTsv\t0" + "'", str8, "false\t-1.0\tMongoDBTsv\t0");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat.Builder builder5 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat4);
        boolean boolean6 = cSVFormat4.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withCommentMarker((java.lang.Character) ' ');
        java.lang.String str11 = cSVFormat10.toString();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withIgnoreHeaderCase(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> CommentStart=< > NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str11, "Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> CommentStart=< > NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = builder2.build();
        org.apache.commons.csv.CSVFormat.Builder builder7 = builder2.setEscape((java.lang.Character) '|');
        org.apache.commons.csv.CSVFormat.Builder builder9 = builder7.setQuote(' ');
        java.sql.ResultSet resultSet10 = null;
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder7.setHeader(resultSet10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase();
        boolean boolean6 = cSVFormat5.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withTrim();
        boolean boolean10 = cSVFormat9.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat.Builder builder11 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat9);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setQuote('\"');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withFirstRecordAsHeader();
        java.sql.ResultSetMetaData resultSetMetaData6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withHeader(resultSetMetaData6);
        boolean boolean8 = cSVFormat5.getAllowDuplicateHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String[] strArray7 = cSVFormat5.getHeader();
        boolean boolean8 = cSVFormat5.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withRecordSeparator("\\N");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withIgnoreHeaderCase();
        boolean boolean12 = cSVFormat11.isQuoteCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withAllowDuplicateHeaderNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVPrinter cSVPrinter12 = cSVFormat11.printer();
        java.lang.String str13 = cSVFormat11.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVPrinter12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:true" + "'", str13, "Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:true");
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withAllowMissingColumnNames(false);
        java.lang.String str13 = cSVFormat8.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\N" + "'", str13, "\\N");
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat.Builder builder9 = cSVFormat6.builder();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setAutoFlush(false);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setRecordSeparator('\"');
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setTrim(false);
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder13.setQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder17.setIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder19.setEscape(',');
        org.apache.commons.csv.CSVFormat.Builder builder23 = builder19.setQuote((java.lang.Character) ' ');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("\\\t\thi!\t\\n\t\\n\t");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.\\??hi!?\\n?\\n?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withAutoFlush(true);
        boolean boolean13 = cSVFormat12.getIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat.Builder builder9 = cSVFormat6.builder();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setAutoFlush(false);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setRecordSeparator('\"');
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setRecordSeparator('#');
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder13.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder17.setIgnoreHeaderCase(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        java.lang.String str1 = cSVFormat0.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withCommentMarker((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withRecordSeparator("false\t-1.0\tMongoDBTsv\t0");
        org.apache.commons.csv.QuoteMode quoteMode6 = org.apache.commons.csv.QuoteMode.ALL_NON_NULL;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat7.printer();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\N" + "'", str1, "\\N");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + quoteMode6 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode6.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser6.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser6.getRecords();
        long long11 = cSVParser6.getCurrentLineNumber();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream12 = cSVParser6.stream();
        java.lang.String str13 = cSVParser6.getHeaderComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(cSVRecordStream12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean3 = cSVFormat2.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat5.printer();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withRecordSeparator('\t');
        boolean boolean11 = cSVFormat5.getIgnoreHeaderCase();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: url");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        boolean boolean3 = cSVFormat0.getIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        java.lang.String str4 = cSVFormat3.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder5 = cSVFormat3.builder();
        org.apache.commons.csv.CSVFormat.Builder builder7 = builder5.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder9 = builder7.setRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setAutoFlush(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t" + "'", str4, "\t");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setTrim(true);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setAllowDuplicateHeaderNames(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withHeader(resultSetMetaData14);
        boolean boolean16 = cSVFormat0.equals((java.lang.Object) cSVFormat13);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withRecordSeparator("\nfalse\t-1.0\tMongoDBTsv\t0");
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat13.withIgnoreSurroundingSpaces();
        char char20 = cSVFormat13.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\t' + "'", char20 == '\t');
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreSurroundingSpaces(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreSurroundingSpaces(true);
        boolean boolean7 = cSVFormat4.getAllowDuplicateHeaderNames();
        java.io.File file8 = null;
        java.nio.charset.Charset charset9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter10 = cSVFormat4.print(file8, charset9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        boolean boolean7 = cSVParser6.isClosed();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser6.iterator();
        long long9 = cSVParser6.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVRecordItor8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVPrinter cSVPrinter6 = cSVFormat3.printer();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withTrim(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVPrinter6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        boolean boolean7 = cSVFormat6.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        boolean boolean10 = cSVFormat9.isEscapeCharacterSet();
        boolean boolean11 = cSVFormat9.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("", cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat.Builder builder12 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat11);
        java.sql.ResultSetMetaData resultSetMetaData13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withHeader(resultSetMetaData13);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVParser cSVParser18 = org.apache.commons.csv.CSVParser.parse("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> IgnoreHeaderCase:ignored SkipHeaderRecord:false", cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVParser18);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withTrim();
        org.apache.commons.csv.CSVFormat.Builder builder9 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat5);
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode10 = cSVFormat5.getDuplicateHeaderMode();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode10 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode10.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Default;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = predefined0.getFormat();
        boolean boolean3 = cSVFormat2.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowMissingColumnNames();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Default + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.Default));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.QuoteMode quoteMode5 = cSVFormat4.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator(' ');
        java.lang.String[] strArray9 = cSVFormat8.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quoteMode5 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode5.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVPrinter cSVPrinter6 = cSVFormat3.printer();
        java.sql.ResultSet resultSet7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVPrinter6.printRecords(resultSet7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVPrinter6);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean5 = cSVFormat3.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("", cSVFormat7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat7.withQuote(' ');
        boolean boolean15 = cSVFormat14.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withTrim();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser19 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: url");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser6.getRecords();
        boolean boolean8 = cSVParser6.isClosed();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser6.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('#');
        boolean boolean3 = cSVFormat0.getTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        java.util.List<java.lang.String> strList9 = cSVParser6.getHeaderNames();
        cSVParser6.close();
        java.lang.String str11 = cSVParser6.getTrailerComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.MySQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        boolean boolean2 = cSVFormat1.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces();
        java.io.Reader reader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser5 = cSVFormat1.parse(reader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MySQL + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.MySQL));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat5.withQuote(' ');
        java.sql.ResultSetMetaData resultSetMetaData13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat5.withHeader(resultSetMetaData13);
        java.lang.String[] strArray15 = cSVFormat5.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        java.lang.String str4 = cSVFormat3.getDelimiterString();
        java.lang.Object obj5 = null;
        boolean boolean6 = cSVFormat3.equals(obj5);
        boolean boolean7 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withIgnoreHeaderCase();
        java.lang.String[] strArray9 = cSVFormat8.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t" + "'", str4, "\t");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withAllowDuplicateHeaderNames(false);
        java.lang.String str12 = cSVFormat8.toString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str12, "Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setTrim(true);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setSkipHeaderRecord(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote('a');
        boolean boolean3 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreHeaderCase(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
        java.nio.file.Path path0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        java.lang.String str6 = cSVFormat5.getDelimiterString();
        java.lang.Object obj7 = null;
        boolean boolean8 = cSVFormat5.equals(obj7);
        java.sql.ResultSetMetaData resultSetMetaData9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withHeader(resultSetMetaData9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat5.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat5.withIgnoreSurroundingSpaces(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser15 = org.apache.commons.csv.CSVParser.parse(path0, charset1, cSVFormat14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: path");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\t" + "'", str6, "\t");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.QuoteMode quoteMode5 = cSVFormat4.getQuoteMode();
        org.apache.commons.csv.CSVPrinter cSVPrinter6 = cSVFormat4.printer();
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(resultSetMetaData7);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quoteMode5 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode5.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVPrinter6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat.Builder builder9 = cSVFormat6.builder();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setAutoFlush(false);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setRecordSeparator('\"');
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setCommentMarker((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder15.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder17.setCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder17.setTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat.Builder builder23 = builder17.setDelimiter('\\');
        org.apache.commons.csv.CSVFormat.Builder builder25 = builder17.setEscape('\t');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean5 = cSVFormat3.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withTrailingDelimiter();
        boolean boolean7 = cSVFormat6.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withSkipHeaderRecord();
        char char10 = cSVFormat9.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        java.lang.String[] strArray13 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withHeader(strArray13);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat6.withHeaderComments((java.lang.Object[]) strArray13);
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder0.setHeaderComments(strArray13);
        org.apache.commons.csv.CSVFormat.Builder builder18 = builder16.setIgnoreHeaderCase(false);
        java.sql.ResultSet resultSet19 = null;
        org.apache.commons.csv.CSVFormat.Builder builder20 = builder18.setHeader(resultSet19);
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder18.setSkipHeaderRecord(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\t' + "'", char10 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withEscape('\\');
        java.lang.Character char8 = cSVFormat7.getQuoteCharacter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(char8);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat0.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreSurroundingSpaces();
        boolean boolean8 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withIgnoreHeaderCase(true);
        boolean boolean10 = cSVFormat9.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse("Delimiter=<\t> Escape=<\\> QuoteChar=< > QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:true", cSVFormat9);
        boolean boolean12 = cSVParser11.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVParser11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat5.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker((java.lang.Character) '#');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter();
        java.lang.String str6 = cSVFormat3.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder7 = cSVFormat3.builder();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\t" + "'", str6, "\t");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withTrailingDelimiter(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat.Builder builder9 = cSVFormat6.builder();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setAutoFlush(false);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setRecordSeparator('\"');
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setCommentMarker((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder15.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder15.setAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder15.setRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> CommentStart=< > NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        java.lang.String str8 = cSVParser6.getTrailerComment();
        cSVParser6.close();
        long long10 = cSVParser6.getCurrentLineNumber();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cSVParser6.getHeaderMap();
        boolean boolean12 = cSVParser6.hasHeaderComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat.Builder builder9 = cSVFormat6.builder();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setAutoFlush(false);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setRecordSeparator('\"');
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setRecordSeparator('#');
        org.apache.commons.csv.QuoteMode quoteMode16 = org.apache.commons.csv.QuoteMode.MINIMAL;
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder13.setQuoteMode(quoteMode16);
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder13.setCommentMarker(',');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + quoteMode16 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode16.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("Delimiter=<\t> Escape=<\\> QuoteChar=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.Delimiter=<?> Escape=<\\> QuoteChar=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<?> SkipHeaderRecord:false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        java.lang.String str8 = cSVParser6.getFirstEndOfLine();
        long long9 = cSVParser6.getCurrentLineNumber();
        java.lang.String str10 = cSVParser6.getHeaderComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat.Predefined predefined1 = org.apache.commons.csv.CSVFormat.Predefined.InformixUnload;
        org.apache.commons.csv.CSVFormat cSVFormat2 = predefined1.getFormat();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse(reader0, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + predefined1 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.InformixUnload + "'", predefined1.equals(org.apache.commons.csv.CSVFormat.Predefined.InformixUnload));
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        java.io.InputStream inputStream0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean6 = cSVFormat4.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse("", cSVFormat8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withIgnoreEmptyLines(true);
        java.lang.String str14 = cSVFormat8.getDelimiterString();
        org.apache.commons.csv.CSVParser cSVParser15 = org.apache.commons.csv.CSVParser.parse("\\N", cSVFormat8);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat8.withAutoFlush(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser18 = org.apache.commons.csv.CSVParser.parse(inputStream0, charset1, cSVFormat17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: inputStream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVParser9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\t" + "'", str14, "\t");
        org.junit.Assert.assertNotNull(cSVParser15);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        java.lang.String str8 = cSVParser6.getTrailerComment();
        cSVParser6.close();
        boolean boolean10 = cSVParser6.isClosed();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cSVParser6.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        java.lang.String str4 = cSVFormat3.getDelimiterString();
        java.lang.Object obj5 = null;
        boolean boolean6 = cSVFormat3.equals(obj5);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(resultSetMetaData7);
        boolean boolean9 = cSVFormat3.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat3.withTrim(true);
        java.lang.String str12 = cSVFormat3.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t" + "'", str4, "\t");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\N" + "'", str12, "\\N");
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('#');
        char char3 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean6 = cSVFormat4.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withAllowMissingColumnNames();
        boolean boolean9 = cSVFormat0.equals((java.lang.Object) cSVFormat4);
        boolean boolean10 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '|' + "'", char3 == '|');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        java.lang.String str4 = cSVFormat3.getDelimiterString();
        java.lang.Object obj5 = null;
        boolean boolean6 = cSVFormat3.equals(obj5);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder13 = cSVFormat3.builder();
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setCommentMarker(',');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t" + "'", str4, "\t");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        java.lang.String str1 = cSVFormat0.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withCommentMarker((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\N" + "'", str1, "\\N");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withAllowDuplicateHeaderNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVPrinter cSVPrinter12 = cSVFormat11.printer();
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean16 = cSVFormat14.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser19 = org.apache.commons.csv.CSVParser.parse("", cSVFormat18);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat18.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat18.withEscape('#');
        cSVPrinter12.print((java.lang.Object) cSVFormat25);
        cSVPrinter12.flush();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVPrinter12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVParser19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withIgnoreHeaderCase(true);
        boolean boolean10 = cSVFormat9.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse("Delimiter=<\t> Escape=<\\> QuoteChar=< > QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:true", cSVFormat9);
        boolean boolean12 = cSVParser11.hasHeaderComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVParser11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withRecordSeparator("false\t-1.0\tMongoDBTsv\t0");
        boolean boolean10 = cSVFormat3.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withTrim(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("#\t\thi!\t#n\t#n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.#??hi!?#n?#n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        boolean boolean8 = cSVParser6.isClosed();
        java.util.List<java.lang.String> strList9 = cSVParser6.getHeaderNames();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator10 = cSVParser6.spliterator();
        java.util.List<java.lang.String> strList11 = cSVParser6.getHeaderNames();
        java.util.Spliterator<java.lang.String> strSpliterator12 = strList11.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator13 = strList11.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertNotNull(strSpliterator13);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        boolean boolean9 = cSVFormat8.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat.Builder builder10 = cSVFormat8.builder();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withEscape(',');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withTrim(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
        java.io.File file0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.QuoteMode quoteMode4 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuoteMode(quoteMode4);
        java.lang.String str6 = cSVFormat2.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withRecordSeparator('4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse(file0, charset1, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: file");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + quoteMode4 + "' != '" + org.apache.commons.csv.QuoteMode.NON_NUMERIC + "'", quoteMode4.equals(org.apache.commons.csv.QuoteMode.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\t" + "'", str6, "\t");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser6.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser6.getRecords();
        java.util.List<java.lang.String> strList11 = cSVParser6.getHeaderNames();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream12 = cSVParser6.stream();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream13 = cSVParser6.stream();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(cSVRecordStream12);
        org.junit.Assert.assertNotNull(cSVRecordStream13);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase();
        boolean boolean6 = cSVFormat5.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withTrim();
        boolean boolean10 = cSVFormat9.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withAllowMissingColumnNames(false);
        boolean boolean14 = cSVFormat13.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames(true);
        boolean boolean5 = cSVFormat0.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        java.lang.String[] strArray8 = cSVFormat0.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        boolean boolean3 = cSVFormat1.getAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean6 = cSVFormat4.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuote((java.lang.Character) '\\');
        boolean boolean10 = cSVFormat1.equals((java.lang.Object) cSVFormat7);
        boolean boolean11 = cSVFormat7.isQuoteCharacterSet();
        boolean boolean12 = cSVFormat7.getAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat7.withSkipHeaderRecord(false);
        boolean boolean15 = cSVFormat14.getTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withTrim(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode8 = cSVFormat3.getDuplicateHeaderMode();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode8 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode8.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withDelimiter('\t');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        boolean boolean6 = cSVFormat5.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withSkipHeaderRecord(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        boolean boolean9 = cSVFormat8.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat.Builder builder10 = cSVFormat8.builder();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withSkipHeaderRecord(false);
        java.lang.String str13 = cSVFormat12.getDelimiterString();
        java.sql.ResultSet resultSet14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withHeader(resultSet14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat12.withIgnoreEmptyLines(true);
        java.io.Reader reader18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser19 = cSVFormat12.parse(reader18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t" + "'", str13, "\t");
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        boolean boolean8 = cSVParser6.isClosed();
        java.util.List<java.lang.String> strList9 = cSVParser6.getHeaderNames();
        boolean boolean10 = cSVParser6.hasHeaderComment();
        boolean boolean11 = cSVParser6.hasHeaderComment();
        long long12 = cSVParser6.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        java.lang.String str1 = cSVFormat0.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\\');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withDelimiter('4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\N" + "'", str1, "\\N");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test794");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("", cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat.Builder builder12 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat11);
        java.sql.ResultSetMetaData resultSetMetaData13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withHeader(resultSetMetaData13);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withQuote('a');
        org.apache.commons.csv.CSVParser cSVParser18 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<\"> QuoteMode=<ALL_NON_NULL> NullString=<> RecordSeparator=<\n> SkipHeaderRecord:false", cSVFormat15);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat15.withEscape((java.lang.Character) '4');
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVParser18);
        org.junit.Assert.assertNotNull(cSVFormat20);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat.Builder builder5 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat4);
        boolean boolean6 = cSVFormat4.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\\\t\thi!\t\\n\t\\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test796");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat.Predefined predefined5 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv;
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, (-1.0d), predefined5, (short) 0 };
        java.lang.String str8 = cSVFormat0.format(objArray7);
        org.apache.commons.csv.CSVFormat.Builder builder9 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        java.lang.String[] strArray19 = new java.lang.String[] { "\t", "hi!", "\n", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat12.withHeader(strArray19);
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder11.setHeader(strArray19);
        java.sql.ResultSet resultSet22 = null;
        org.apache.commons.csv.CSVFormat.Builder builder23 = builder11.setHeader(resultSet22);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + predefined5 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv + "'", predefined5.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "false\t-1.0\tMongoDBTsv\t0" + "'", str8, "false\t-1.0\tMongoDBTsv\t0");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        org.apache.commons.csv.CSVPrinter cSVPrinter5 = cSVFormat3.printer();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean9 = cSVFormat7.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse("", cSVFormat11);
        java.lang.String str13 = cSVParser12.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cSVParser12.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator15 = cSVParser12.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList16 = cSVParser12.getRecords();
        long long17 = cSVParser12.getCurrentLineNumber();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream18 = cSVParser12.stream();
        cSVPrinter5.printRecord(cSVRecordStream18);
        java.sql.ResultSet resultSet20 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVPrinter5.printRecords(resultSet20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVPrinter5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVParser12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator15);
        org.junit.Assert.assertNotNull(cSVRecordList16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertNotNull(cSVRecordStream18);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test798");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('|');
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat1.builder();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withAllowDuplicateHeaderNames(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test799");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withHeader(resultSetMetaData14);
        boolean boolean16 = cSVFormat0.equals((java.lang.Object) cSVFormat13);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withRecordSeparator("\nfalse\t-1.0\tMongoDBTsv\t0");
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat13.withIgnoreSurroundingSpaces();
        boolean boolean20 = cSVFormat13.getTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test800");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuote((java.lang.Character) '\\');
        char char6 = cSVFormat3.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withTrailingDelimiter(true);
        java.lang.Character char13 = cSVFormat12.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withAllowDuplicateHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\t' + "'", char6 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(char13);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test801");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test802");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withHeader(resultSetMetaData14);
        boolean boolean16 = cSVFormat0.equals((java.lang.Object) cSVFormat13);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withRecordSeparator("\nfalse\t-1.0\tMongoDBTsv\t0");
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat13.withIgnoreSurroundingSpaces();
        boolean boolean20 = cSVFormat19.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test803");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser6.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser6.getRecords();
        long long11 = cSVParser6.getCurrentLineNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor12 = cSVParser6.iterator();
        java.lang.Class<?> wildcardClass13 = cSVParser6.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(cSVRecordItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test804");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator("#\t\thi!\t#n\t#n");
        org.apache.commons.csv.CSVFormat.Builder builder8 = cSVFormat5.builder();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test805");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat7.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode14 = cSVFormat7.getDuplicateHeaderMode();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode14 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode14.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test806");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        boolean boolean8 = cSVParser6.isClosed();
        java.util.List<java.lang.String> strList9 = cSVParser6.getHeaderNames();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator10 = cSVParser6.spliterator();
        long long11 = cSVParser6.getRecordNumber();
        boolean boolean12 = cSVParser6.hasTrailerComment();
        long long13 = cSVParser6.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test807");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat.Builder builder6 = cSVFormat5.builder();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator("false,-1.0,MongoDBTsv,0");
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test808");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat.Predefined predefined5 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv;
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, (-1.0d), predefined5, (short) 0 };
        java.lang.String str8 = cSVFormat0.format(objArray7);
        org.apache.commons.csv.CSVFormat.Builder builder9 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        java.lang.String[] strArray19 = new java.lang.String[] { "\t", "hi!", "\n", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat12.withHeader(strArray19);
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder11.setHeader(strArray19);
        org.apache.commons.csv.CSVFormat.Builder builder23 = builder11.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder25 = builder11.setQuote('#');
        org.apache.commons.csv.CSVFormat.Builder builder27 = builder25.setIgnoreHeaderCase(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + predefined5 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv + "'", predefined5.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "false\t-1.0\tMongoDBTsv\t0" + "'", str8, "false\t-1.0\tMongoDBTsv\t0");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test809");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean5 = cSVFormat3.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withTrailingDelimiter();
        boolean boolean7 = cSVFormat6.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withSkipHeaderRecord();
        char char10 = cSVFormat9.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        java.lang.String[] strArray13 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withHeader(strArray13);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat6.withHeaderComments((java.lang.Object[]) strArray13);
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder0.setHeaderComments(strArray13);
        org.apache.commons.csv.CSVFormat.Builder builder18 = builder0.setRecordSeparator("false\t-1.0\tMongoDBTsv\t0");
        org.apache.commons.csv.CSVFormat.Builder builder20 = builder0.setIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder20.setAllowDuplicateHeaderNames(false);
        java.lang.Object[] objArray23 = null;
        org.apache.commons.csv.CSVFormat.Builder builder24 = builder20.setHeaderComments(objArray23);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\t' + "'", char10 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test810");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        boolean boolean5 = cSVFormat4.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withSkipHeaderRecord();
        char char8 = cSVFormat7.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withIgnoreSurroundingSpaces(true);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withHeader(strArray11);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat4.withHeaderComments((java.lang.Object[]) strArray11);
        org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat13);
        boolean boolean15 = cSVFormat13.isEscapeCharacterSet();
        boolean boolean16 = cSVFormat13.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withIgnoreEmptyLines(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\t' + "'", char8 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVParser14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test811");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withFirstRecordAsHeader();
        java.lang.String str10 = cSVFormat9.getDelimiterString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\t" + "'", str10, "\t");
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test812");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat.Builder builder9 = cSVFormat6.builder();
        java.sql.ResultSet resultSet10 = null;
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setHeader(resultSet10);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder9.setIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test813");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat5.withQuote(' ');
        boolean boolean13 = cSVFormat12.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test814");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode9 = cSVFormat8.getDuplicateHeaderMode();
        java.lang.Class<?> wildcardClass10 = cSVFormat8.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode9 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode9.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test815");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat0.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat.Builder builder5 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat0);
        org.apache.commons.csv.CSVFormat.Builder builder7 = builder5.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder9 = builder7.setCommentMarker('4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test816");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withAllowDuplicateHeaderNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test817");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        boolean boolean8 = cSVParser6.hasHeaderComment();
        java.util.List<java.lang.String> strList9 = cSVParser6.getHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test818");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withHeader(resultSetMetaData8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode14 = cSVFormat9.getDuplicateHeaderMode();
        java.lang.String str15 = cSVFormat9.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat9.withTrim();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser19 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat16, (long) (short) 0, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode14 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode14.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test819");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat.Builder builder3 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat1);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuote((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withFirstRecordAsHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test820");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames(true);
        boolean boolean5 = cSVFormat0.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreHeaderCase(false);
        java.lang.Character char8 = cSVFormat0.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(char8);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test821");
        java.io.File file0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        char char4 = cSVFormat3.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withAllowDuplicateHeaderNames(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse(file0, charset1, cSVFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: file");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\t' + "'", char4 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test822");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withSkipHeaderRecord();
        char char7 = cSVFormat6.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreSurroundingSpaces(true);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withHeader(strArray10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeaderComments((java.lang.Object[]) strArray10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat3.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withAllowDuplicateHeaderNames(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\t' + "'", char7 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test823");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        java.sql.ResultSet resultSet5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withHeader(resultSet5);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test824");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        java.lang.String str4 = cSVFormat3.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder5 = cSVFormat3.builder();
        org.apache.commons.csv.CSVFormat.Builder builder7 = builder5.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder9 = builder5.setNullString("\\\t\thi!\t\\n\t\\n");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t" + "'", str4, "\t");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test825");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        java.lang.String str4 = cSVFormat3.getDelimiterString();
        java.lang.Object obj5 = null;
        boolean boolean6 = cSVFormat3.equals(obj5);
        boolean boolean7 = cSVFormat3.getTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t" + "'", str4, "\t");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test826");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase();
        boolean boolean6 = cSVFormat5.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withTrim();
        boolean boolean10 = cSVFormat9.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withAllowMissingColumnNames(false);
        boolean boolean14 = cSVFormat13.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test827");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withAllowDuplicateHeaderNames();
        java.io.File file8 = null;
        java.nio.charset.Charset charset9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter10 = cSVFormat0.print(file8, charset9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test828");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        java.lang.String str5 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat.Builder builder6 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat4);
        java.lang.String[] strArray7 = cSVFormat4.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreHeaderCase();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode9 = cSVFormat4.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat4.withAllowMissingColumnNames(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode9 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode9.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test829");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        boolean boolean8 = cSVParser6.isClosed();
        java.util.List<java.lang.String> strList9 = cSVParser6.getHeaderNames();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator10 = cSVParser6.spliterator();
        long long11 = cSVParser6.getRecordNumber();
        boolean boolean12 = cSVParser6.hasTrailerComment();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList13 = cSVParser6.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVRecordList13);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test830");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.lang.String[] strArray7 = cSVFormat0.getHeaderComments();
        java.lang.Character char8 = cSVFormat0.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        org.apache.commons.csv.CSVFormat.Predefined predefined12 = org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLText;
        boolean boolean13 = cSVFormat11.equals((java.lang.Object) predefined12);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean18 = cSVFormat16.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat.Predefined predefined21 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv;
        java.lang.Object[] objArray23 = new java.lang.Object[] { false, (-1.0d), predefined21, (short) 0 };
        java.lang.String str24 = cSVFormat16.format(objArray23);
        org.apache.commons.csv.CSVFormat.Builder builder25 = cSVFormat16.builder();
        org.apache.commons.csv.CSVFormat.Builder builder27 = builder25.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        java.lang.String[] strArray35 = new java.lang.String[] { "\t", "hi!", "\n", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat28.withHeader(strArray35);
        org.apache.commons.csv.CSVFormat.Builder builder37 = builder27.setHeader(strArray35);
        java.lang.String str38 = cSVFormat15.format((java.lang.Object[]) strArray35);
        java.lang.String str39 = cSVFormat10.format((java.lang.Object[]) strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat10.withIgnoreHeaderCase(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + predefined12 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLText + "'", predefined12.equals(org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLText));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + predefined21 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv + "'", predefined21.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv));
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "false\t-1.0\tMongoDBTsv\t0" + "'", str24, "false\t-1.0\tMongoDBTsv\t0");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\\\t\thi!\t\\n\t\\n" + "'", str38, "\\\t\thi!\t\\n\t\\n");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "#\t\thi!\t#n\t#n" + "'", str39, "#\t\thi!\t#n\t#n");
        org.junit.Assert.assertNotNull(cSVFormat41);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test831");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        boolean boolean8 = cSVParser6.isClosed();
        java.util.List<java.lang.String> strList9 = cSVParser6.getHeaderNames();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator10 = cSVParser6.spliterator();
        cSVParser6.close();
        long long12 = cSVParser6.getRecordNumber();
        java.lang.String str13 = cSVParser6.getHeaderComment();
        boolean boolean14 = cSVParser6.hasHeaderComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test832");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withQuote('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test833");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("", cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withIgnoreEmptyLines(true);
        java.lang.String str12 = cSVFormat6.getDelimiterString();
        org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse("\\N", cSVFormat6);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor14 = cSVParser13.iterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList15 = cSVParser13.getRecords();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream16 = cSVParser13.stream();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor17 = cSVParser13.iterator();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t" + "'", str12, "\t");
        org.junit.Assert.assertNotNull(cSVParser13);
        org.junit.Assert.assertNotNull(cSVRecordItor14);
        org.junit.Assert.assertNotNull(cSVRecordList15);
        org.junit.Assert.assertNotNull(cSVRecordStream16);
        org.junit.Assert.assertNotNull(cSVRecordItor17);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test834");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat5.withEscape('#');
        boolean boolean13 = cSVFormat5.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test835");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat5.withQuote(' ');
        boolean boolean13 = cSVFormat12.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat12.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat12.withAllowMissingColumnNames(false);
        boolean boolean20 = cSVFormat19.getTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test836");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        boolean boolean3 = cSVFormat0.getTrim();
        boolean boolean4 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test837");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser6.spliterator();
        boolean boolean8 = cSVParser6.isClosed();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cSVParser6.getHeaderMap();
        boolean boolean10 = cSVParser6.hasTrailerComment();
        cSVParser6.close();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test838");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        java.lang.String str1 = cSVFormat0.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withCommentMarker((java.lang.Character) '\"');
        java.lang.String[] strArray4 = cSVFormat3.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\N" + "'", str1, "\\N");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(strArray4);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test839");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        boolean boolean8 = cSVFormat7.isCommentMarkerSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse(reader0, cSVFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test840");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        java.lang.String str4 = cSVFormat3.getDelimiterString();
        java.lang.Object obj5 = null;
        boolean boolean6 = cSVFormat3.equals(obj5);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat3.withSkipHeaderRecord();
        java.lang.Character char12 = cSVFormat11.getQuoteCharacter();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode13 = cSVFormat11.getDuplicateHeaderMode();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t" + "'", str4, "\t");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(char12);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode13 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode13.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test841");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        boolean boolean3 = cSVFormat1.getAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean6 = cSVFormat4.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuote((java.lang.Character) '\\');
        boolean boolean10 = cSVFormat1.equals((java.lang.Object) cSVFormat7);
        java.lang.String str11 = cSVFormat1.getNullString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat1.withCommentMarker((java.lang.Character) '\\');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start and the escape character cannot be the same ('\\')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\N" + "'", str11, "\\N");
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test842");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withDelimiter('\t');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) '#');
        boolean boolean8 = cSVFormat7.getTrailingDelimiter();
        boolean boolean9 = cSVFormat7.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse("\\\t\thi!\t\\n\t\\n\t", cSVFormat7);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withCommentMarker('a');
        boolean boolean13 = cSVFormat7.getSkipHeaderRecord();
        org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse("\\N", cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVParser10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVParser14);
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test843");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setDelimiter('\t');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test844");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        boolean boolean9 = cSVFormat8.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat.Builder builder10 = cSVFormat8.builder();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withSkipHeaderRecord(false);
        java.lang.String str13 = cSVFormat12.getDelimiterString();
        java.sql.ResultSet resultSet14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withHeader(resultSet14);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withRecordSeparator("Delimiter=<\t> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        boolean boolean19 = cSVFormat18.getTrim();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t" + "'", str13, "\t");
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test845");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.QuoteMode quoteMode2 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuoteMode(quoteMode2);
        java.lang.String str4 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withTrim();
        java.lang.String str6 = cSVFormat5.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreEmptyLines(false);
        boolean boolean9 = cSVFormat8.isQuoteCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + quoteMode2 + "' != '" + org.apache.commons.csv.QuoteMode.NON_NUMERIC + "'", quoteMode2.equals(org.apache.commons.csv.QuoteMode.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t" + "'", str4, "\t");
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test846");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withEscape('\\');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withEscape((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withTrailingDelimiter(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test847");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withAllowDuplicateHeaderNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVPrinter cSVPrinter12 = cSVFormat11.printer();
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean16 = cSVFormat14.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser19 = org.apache.commons.csv.CSVParser.parse("", cSVFormat18);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat18.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat18.withEscape('#');
        cSVPrinter12.print((java.lang.Object) cSVFormat25);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat25.withRecordSeparator('\"');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVPrinter12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVParser19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat28);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test848");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean2 = cSVFormat1.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withDelimiter('\t');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withRecordSeparator(',');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:true", cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVParser11);
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test849");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean2 = cSVFormat1.getIgnoreHeaderCase();
        boolean boolean3 = cSVFormat1.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreEmptyLines();
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withHeader(resultSet7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withEscape('\"');
        org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse(",\tDelimiter=<\\\t> Escape=<\\\\> QuoteMode=<ALL_NON_NULL> NullString=<\\\\N> RecordSeparator=<\\n> SkipHeaderRecord:false\tfalse,-1.0,MongoDBTsv,0", cSVFormat8);
        boolean boolean12 = cSVParser11.hasHeaderComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVParser11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test850");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Default;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = predefined0.getFormat();
        boolean boolean3 = cSVFormat2.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withRecordSeparator('#');
        boolean boolean6 = cSVFormat5.isEscapeCharacterSet();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Default + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.Default));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test851");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withDelimiter('\t');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase(false);
        boolean boolean8 = cSVFormat5.getIgnoreEmptyLines();
        org.apache.commons.csv.QuoteMode quoteMode9 = cSVFormat5.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withQuoteMode(quoteMode9);
        boolean boolean11 = cSVFormat10.getAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withSkipHeaderRecord(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + quoteMode9 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode9.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test852");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape((java.lang.Character) '4');
        boolean boolean7 = cSVFormat6.isEscapeCharacterSet();
        boolean boolean8 = cSVFormat6.getAllowDuplicateHeaderNames();
        java.io.Reader reader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = cSVFormat6.parse(reader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test853");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat.Builder builder9 = cSVFormat6.builder();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setQuote('\\');
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setCommentMarker('\\');
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder11.setRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteChar=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test854");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withAllowMissingColumnNames(false);
        boolean boolean7 = cSVFormat4.getAutoFlush();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test855");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        boolean boolean2 = cSVFormat0.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withDelimiter(' ');
        java.io.File file5 = null;
        java.nio.charset.Charset charset6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter7 = cSVFormat0.print(file5, charset6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test856");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = builder2.build();
        org.apache.commons.csv.CSVFormat.Builder builder7 = builder2.setEscape('#');
        org.apache.commons.csv.CSVFormat.Builder builder9 = builder2.setQuote((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder2.setQuote((java.lang.Character) '#');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test857");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        java.lang.String str4 = cSVFormat3.getDelimiterString();
        java.lang.Object obj5 = null;
        boolean boolean6 = cSVFormat3.equals(obj5);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withIgnoreSurroundingSpaces(true);
        boolean boolean13 = cSVFormat12.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t" + "'", str4, "\t");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test858");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        java.lang.String str5 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test859");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        java.lang.String str8 = cSVParser6.getFirstEndOfLine();
        long long9 = cSVParser6.getCurrentLineNumber();
        java.util.List<java.lang.String> strList10 = cSVParser6.getHeaderNames();
        long long11 = cSVParser6.getRecordNumber();
        java.util.List<java.lang.String> strList12 = cSVParser6.getHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test860");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_TSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder3 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test861");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAutoFlush(true);
        java.lang.String str3 = cSVFormat0.getDelimiterString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test862");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test863");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withFirstRecordAsHeader();
        java.sql.ResultSetMetaData resultSetMetaData6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withHeader(resultSetMetaData6);
        java.io.File file8 = null;
        java.nio.charset.Charset charset9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter10 = cSVFormat7.print(file8, charset9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test864");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        org.apache.commons.csv.CSVPrinter cSVPrinter5 = cSVFormat3.printer();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withIgnoreHeaderCase(false);
        boolean boolean8 = cSVFormat7.getAllowDuplicateHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVPrinter5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test865");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat5.withQuote(' ');
        boolean boolean13 = cSVFormat12.isCommentMarkerSet();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode14 = cSVFormat12.getDuplicateHeaderMode();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode14 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode14.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test866");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> CommentStart=< > NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.Delimiter=<?> Escape=<\\> QuoteMode=<ALL_NON_NULL> CommentStart=< > NullString=<\\N> RecordSeparator=<?> SkipHeaderRecord:false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test867");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote(' ');
        boolean boolean3 = cSVFormat2.isQuoteCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test868");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat.Predefined predefined5 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv;
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, (-1.0d), predefined5, (short) 0 };
        java.lang.String str8 = cSVFormat0.format(objArray7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withCommentMarker((java.lang.Character) ' ');
        java.lang.String str11 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withIgnoreEmptyLines();
        java.lang.String str13 = cSVFormat12.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withDelimiter(',');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + predefined5 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv + "'", predefined5.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "false\t-1.0\tMongoDBTsv\t0" + "'", str8, "false\t-1.0\tMongoDBTsv\t0");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t" + "'", str11, "\t");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\N" + "'", str13, "\\N");
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test869");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat5.withQuote(' ');
        boolean boolean13 = cSVFormat12.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat15.withSystemRecordSeparator();
        boolean boolean17 = cSVFormat15.getTrim();
        org.apache.commons.csv.CSVPrinter cSVPrinter18 = cSVFormat15.printer();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cSVPrinter18);
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test870");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat.Builder builder6 = cSVFormat5.builder();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withRecordSeparator(' ');
        org.apache.commons.csv.QuoteMode quoteMode9 = cSVFormat5.getQuoteMode();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + quoteMode9 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode9.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test871");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser6.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser6.getRecords();
        long long11 = cSVParser6.getCurrentLineNumber();
        java.util.List<java.lang.String> strList12 = cSVParser6.getHeaderNames();
        java.util.Spliterator<java.lang.String> strSpliterator13 = strList12.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator14 = strList12.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertNotNull(strSpliterator14);
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test872");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withDelimiter('\t');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withCommentMarker('|');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator(",\tDelimiter=<\\\t> Escape=<\\\\> QuoteMode=<ALL_NON_NULL> NullString=<\\\\N> RecordSeparator=<\\n> SkipHeaderRecord:false\tfalse,-1.0,MongoDBTsv,0");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test873");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.QuoteMode quoteMode4 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuoteMode(quoteMode4);
        java.lang.String str6 = cSVFormat2.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withTrim();
        org.apache.commons.csv.QuoteMode quoteMode8 = cSVFormat2.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat2.withAllowDuplicateHeaderNames(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: url");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + quoteMode4 + "' != '" + org.apache.commons.csv.QuoteMode.NON_NUMERIC + "'", quoteMode4.equals(org.apache.commons.csv.QuoteMode.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\t" + "'", str6, "\t");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + quoteMode8 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode8.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test874");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        java.lang.String[] strArray7 = new java.lang.String[] { "\t", "hi!", "\n", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withHeader(strArray7);
        java.sql.ResultSetMetaData resultSetMetaData9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withHeader(resultSetMetaData9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withSkipHeaderRecord();
        boolean boolean12 = cSVFormat11.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test875");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase();
        boolean boolean6 = cSVFormat5.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withTrim();
        boolean boolean10 = cSVFormat9.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test876");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.sql.ResultSet resultSet1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSet1);
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean4 = cSVFormat3.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withDelimiter('\t');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker((java.lang.Character) '#');
        boolean boolean9 = cSVFormat6.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean12 = cSVFormat11.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withSkipHeaderRecord();
        org.apache.commons.csv.CSVPrinter cSVPrinter16 = cSVFormat14.printer();
        java.lang.Appendable appendable17 = cSVPrinter16.getOut();
        cSVFormat2.print((java.lang.Object) cSVFormat10, appendable17, false);
        java.lang.String str20 = cSVFormat2.getRecordSeparator();
        boolean boolean21 = cSVFormat2.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVPrinter16);
        org.junit.Assert.assertNotNull(appendable17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\r\n" + "'", str20, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test877");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        boolean boolean8 = cSVParser6.isClosed();
        java.util.List<java.lang.String> strList9 = cSVParser6.getHeaderNames();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator10 = cSVParser6.spliterator();
        long long11 = cSVParser6.getRecordNumber();
        boolean boolean12 = cSVParser6.hasTrailerComment();
        long long13 = cSVParser6.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test878");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withIgnoreHeaderCase(true);
        java.sql.ResultSetMetaData resultSetMetaData12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withHeader(resultSetMetaData12);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat8.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withNullString("");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test879");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreHeaderCase();
        java.sql.ResultSet resultSet10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withHeader(resultSet10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withSkipHeaderRecord(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test880");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        java.lang.String str1 = cSVFormat0.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withCommentMarker((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.QuoteMode quoteMode5 = cSVFormat0.getQuoteMode();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\N" + "'", str1, "\\N");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quoteMode5 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode5.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
    }

    @Test
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test881");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        java.lang.String str5 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withRecordSeparator("\t");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> CommentStart=< > NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        java.sql.ResultSet resultSet10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withHeader(resultSet10);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test882");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withAllowDuplicateHeaderNames(false);
        java.lang.Character char12 = cSVFormat11.getCommentMarker();
        java.io.Reader reader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = cSVFormat11.parse(reader13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(char12);
    }

    @Test
    public void test883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test883");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker(' ');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test884");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat.Builder builder5 = cSVFormat4.builder();
        org.apache.commons.csv.CSVFormat.Builder builder7 = builder5.setQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean10 = cSVFormat8.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withAutoFlush(true);
        java.lang.String[] strArray15 = cSVFormat8.getHeaderComments();
        java.lang.Character char16 = cSVFormat8.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat8.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        org.apache.commons.csv.CSVFormat.Predefined predefined20 = org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLText;
        boolean boolean21 = cSVFormat19.equals((java.lang.Object) predefined20);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat19.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean26 = cSVFormat24.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat.Predefined predefined29 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv;
        java.lang.Object[] objArray31 = new java.lang.Object[] { false, (-1.0d), predefined29, (short) 0 };
        java.lang.String str32 = cSVFormat24.format(objArray31);
        org.apache.commons.csv.CSVFormat.Builder builder33 = cSVFormat24.builder();
        org.apache.commons.csv.CSVFormat.Builder builder35 = builder33.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat36 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        java.lang.String[] strArray43 = new java.lang.String[] { "\t", "hi!", "\n", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat36.withHeader(strArray43);
        org.apache.commons.csv.CSVFormat.Builder builder45 = builder35.setHeader(strArray43);
        java.lang.String str46 = cSVFormat23.format((java.lang.Object[]) strArray43);
        java.lang.String str47 = cSVFormat18.format((java.lang.Object[]) strArray43);
        org.apache.commons.csv.CSVFormat.Builder builder48 = builder7.setHeader(strArray43);
        org.apache.commons.csv.CSVFormat.Builder builder50 = builder48.setIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(char16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + predefined20 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLText + "'", predefined20.equals(org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLText));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + predefined29 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv + "'", predefined29.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv));
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "false\t-1.0\tMongoDBTsv\t0" + "'", str32, "false\t-1.0\tMongoDBTsv\t0");
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\\\t\thi!\t\\n\t\\n" + "'", str46, "\\\t\thi!\t\\n\t\\n");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "#\t\thi!\t#n\t#n" + "'", str47, "#\t\thi!\t#n\t#n");
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
    }

    @Test
    public void test885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test885");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        java.lang.String str8 = cSVParser6.getFirstEndOfLine();
        long long9 = cSVParser6.getCurrentLineNumber();
        java.util.List<java.lang.String> strList10 = cSVParser6.getHeaderNames();
        long long11 = cSVParser6.getRecordNumber();
        cSVParser6.close();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test886");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        java.lang.String str4 = cSVFormat3.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder5 = cSVFormat3.builder();
        org.apache.commons.csv.CSVFormat.Builder builder7 = builder5.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder9 = builder7.setDelimiter('4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t" + "'", str4, "\t");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test887");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVPrinter cSVPrinter2 = cSVFormat0.printer();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withAllowDuplicateHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVPrinter2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test888");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser6.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser6.getRecords();
        java.util.List<java.lang.String> strList11 = cSVParser6.getHeaderNames();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator12 = cSVParser6.spliterator();
        long long13 = cSVParser6.getCurrentLineNumber();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cSVParser6.getHeaderMap();
        long long15 = cSVParser6.getRecordNumber();
        java.lang.String str16 = cSVParser6.getFirstEndOfLine();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test889");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator("#\t\thi!\t#n\t#n");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuote((java.lang.Character) 'a');
        java.io.Reader reader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = cSVFormat9.parse(reader10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test890");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        java.lang.String str8 = cSVParser6.getTrailerComment();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream9 = cSVParser6.stream();
        java.lang.String str10 = cSVParser6.getTrailerComment();
        boolean boolean11 = cSVParser6.hasTrailerComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(cSVRecordStream9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test891");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        boolean boolean8 = cSVParser6.isClosed();
        java.util.List<java.lang.String> strList9 = cSVParser6.getHeaderNames();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator10 = cSVParser6.spliterator();
        cSVParser6.close();
        long long12 = cSVParser6.getRecordNumber();
        long long13 = cSVParser6.getCurrentLineNumber();
        long long14 = cSVParser6.getRecordNumber();
        java.lang.String str15 = cSVParser6.getHeaderComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test892");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withFirstRecordAsHeader();
        java.sql.ResultSetMetaData resultSetMetaData6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withHeader(resultSetMetaData6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test893");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat5.withQuote(' ');
        boolean boolean13 = cSVFormat12.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withSkipHeaderRecord();
        boolean boolean15 = cSVFormat14.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withAllowMissingColumnNames(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withCommentMarker(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start character and the quoteChar cannot be the same (' ')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test894");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("", cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreSurroundingSpaces(false);
        boolean boolean10 = cSVFormat9.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat.Builder builder11 = cSVFormat9.builder();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat9.withAllowDuplicateHeaderNames(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser16 = org.apache.commons.csv.CSVParser.parse(reader0, cSVFormat15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test895");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode13 = cSVFormat8.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withIgnoreHeaderCase(true);
        java.lang.String[] strArray17 = cSVFormat14.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode13 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode13.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test896");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test897");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withAllowMissingColumnNames(true);
        boolean boolean8 = cSVFormat7.isEscapeCharacterSet();
        java.lang.String[] strArray9 = cSVFormat7.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withRecordSeparator("\nfalse\t-1.0\tMongoDBTsv\t0");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test898");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        java.lang.String str1 = cSVFormat0.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\\');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withDelimiter('\"');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\N" + "'", str1, "\\N");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test899");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withQuote((java.lang.Character) '#');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test900");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat5.withQuote(' ');
        boolean boolean13 = cSVFormat12.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean19 = cSVFormat17.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withTrailingDelimiter();
        java.lang.String str21 = cSVFormat20.getDelimiterString();
        boolean boolean22 = cSVFormat20.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat20.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.QuoteMode quoteMode25 = org.apache.commons.csv.QuoteMode.MINIMAL;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat20.withQuoteMode(quoteMode25);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat12.withQuoteMode(quoteMode25);
        java.lang.Character char28 = cSVFormat27.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\t" + "'", str21, "\t");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + quoteMode25 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode25.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNull(char28);
    }

    @Test
    public void test901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test901");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withDelimiter('\t');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase(false);
        boolean boolean8 = cSVFormat5.getIgnoreEmptyLines();
        org.apache.commons.csv.QuoteMode quoteMode9 = cSVFormat5.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withQuoteMode(quoteMode9);
        java.lang.String[] strArray11 = cSVFormat10.getHeaderComments();
        org.apache.commons.csv.CSVPrinter cSVPrinter12 = cSVFormat10.printer();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + quoteMode9 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode9.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(cSVPrinter12);
    }

    @Test
    public void test902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test902");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withDelimiter('\t');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase(false);
        java.lang.Character char6 = cSVFormat3.getQuoteCharacter();
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(resultSet7);
        org.apache.commons.csv.CSVPrinter cSVPrinter9 = cSVFormat8.printer();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVPrinter9);
    }

    @Test
    public void test903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test903");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase();
        boolean boolean6 = cSVFormat5.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withTrim();
        boolean boolean10 = cSVFormat9.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat.Builder builder11 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat9);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setIgnoreEmptyLines(true);
        java.sql.ResultSet resultSet14 = null;
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder11.setHeader(resultSet14);
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder15.setQuote('\\');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test904");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test905");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        java.lang.String str4 = cSVFormat3.getDelimiterString();
        java.lang.Object obj5 = null;
        boolean boolean6 = cSVFormat3.equals(obj5);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat3.withSkipHeaderRecord();
        boolean boolean12 = cSVFormat11.getAllowDuplicateHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t" + "'", str4, "\t");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }
}

