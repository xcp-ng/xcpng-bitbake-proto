
PN = "perl-Data-OptList"
PE = "0"
PV = "0.114"
PR = "7.el10"
PACKAGES = "perl-Data-OptList perl-Data-OptList-tests"


URI_perl-Data-OptList = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Data-OptList-0.114-7.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Data-OptList = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(List::Util) ( ) perl(Params::Util) ( ) perl(Sub::Install) ( >=  0.921)"
RPROVIDES:perl-Data-OptList = "perl(Data::OptList) ( =  0.114) perl-Data-OptList ( =  0.114-7.el10)"

URI_perl-Data-OptList-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Data-OptList-tests-0.114-7.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Data-OptList-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(File::Spec) ( ) perl(ExtUtils::MakeMaker) ( ) perl(Data::OptList) ( ) perl(Sub::Install) ( ) perl(Test::More) ( >=  0.88) perl-Data-OptList ( =  0.114-7.el10)"
RPROVIDES:perl-Data-OptList-tests = "perl-Data-OptList-tests ( =  0.114-7.el10)"
