
PN = "perl-XML-Catalog"
PE = "0"
PV = "1.03"
PR = "32.el10"
PACKAGES = "perl-XML-Catalog perl-XML-Catalog-tests"


URI_perl-XML-Catalog = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-XML-Catalog-1.03-32.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-XML-Catalog = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(vars) ( ) perl(Text::ParseWords) ( ) perl(XML::Parser) ( ) perl(LWP::Simple) ( ) perl(URI::URL) ( )"
RPROVIDES:perl-XML-Catalog = "perl(XML::Catalog) ( =  1.03) perl(XML::Catalog::XML) ( =  1.02) perl-XML-Catalog ( =  1.03-32.el10)"

URI_perl-XML-Catalog-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-XML-Catalog-tests-1.03-32.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-XML-Catalog-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(Cwd) ( ) perl-XML-Catalog ( =  1.03-32.el10)"
RPROVIDES:perl-XML-Catalog-tests = "perl-XML-Catalog-tests ( =  1.03-32.el10)"
