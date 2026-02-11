
PN = "perl-XML-Parser"
PE = "0"
PV = "2.47"
PR = "6.el10"
PACKAGES = "perl-XML-Parser perl-XML-Parser-tests"


URI_perl-XML-Parser = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-XML-Parser-2.47-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-XML-Parser = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl-libs ( ) perl(Carp) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libperl.so.5.40()(64bit) ( ) perl(XSLoader) ( ) perl(File::Spec) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) perl(overload) ( ) libexpat.so.1()(64bit) ( ) perl(IO::File) ( ) perl(IO::Handle) ( ) perl(LWP::UserAgent) ( ) perl(URI) ( ) perl(URI::file) ( )"
RPROVIDES:perl-XML-Parser = "perl(XML::Parser::Style::Debug) ( ) perl(XML::Parser::Style::Objects) ( ) perl(XML::Parser::Style::Stream) ( ) perl(XML::Parser::Style::Subs) ( ) perl(XML::Parser::Style::Tree) ( ) perl(XML::Parser) ( =  2.47) perl(XML::Parser::Expat) ( =  2.47) perl-XML-Parser ( =  2.47-6.el10) perl-XML-Parser(x86-64) ( =  2.47-6.el10)"

URI_perl-XML-Parser-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-XML-Parser-tests-2.47-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-XML-Parser-tests = "perl(strict) ( ) /usr/bin/perl ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) /usr/bin/bash ( ) perl(Test) ( ) perl(IO::File) ( ) perl(FileHandle) ( ) perl(if) ( ) perl(XML::Parser) ( ) perl-XML-Parser ( =  2.47-6.el10)"
RPROVIDES:perl-XML-Parser-tests = "perl-XML-Parser-tests ( =  2.47-6.el10) perl-XML-Parser-tests(x86-64) ( =  2.47-6.el10)"
