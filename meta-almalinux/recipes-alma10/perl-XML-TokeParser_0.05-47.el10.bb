
PN = "perl-XML-TokeParser"
PE = "0"
PV = "0.05"
PR = "47.el10"
PACKAGES = "perl-XML-TokeParser perl-XML-TokeParser-tests"


URI_perl-XML-TokeParser = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-XML-TokeParser-0.05-47.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-XML-TokeParser = "perl(strict) ( ) perl-libs ( ) perl(Carp) ( ) perl(vars) ( ) perl(IO::File) ( ) perl(XML::Parser) ( ) perl(XML::Catalog) ( ) perl(XML::Parser) ( >=  2)"
RPROVIDES:perl-XML-TokeParser = "perl(XML::TokeParser::Token) ( ) perl(XML::TokeParser) ( =  0.05) perl-XML-TokeParser ( =  0.05-47.el10)"

URI_perl-XML-TokeParser-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-XML-TokeParser-tests-0.05-47.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-XML-TokeParser-tests = "/usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(Test) ( ) perl(XML::TokeParser) ( ) perl-XML-TokeParser ( =  0.05-47.el10)"
RPROVIDES:perl-XML-TokeParser-tests = "perl-XML-TokeParser-tests ( =  0.05-47.el10)"
