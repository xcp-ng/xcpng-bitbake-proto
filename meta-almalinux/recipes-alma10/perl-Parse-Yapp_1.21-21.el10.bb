
PN = "perl-Parse-Yapp"
PE = "0"
PV = "1.21"
PR = "21.el10"
PACKAGES = "perl-Parse-Yapp perl-Parse-Yapp-tests"


URI_perl-Parse-Yapp = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Parse-Yapp-1.21-21.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Parse-Yapp = "perl(strict) ( ) perl-libs ( ) perl(Carp) ( ) /usr/bin/perl ( ) perl(vars) ( ) perl(File::Basename) ( ) perl(Config) ( ) perl(Parse::Yapp) ( ) perl(Parse::Yapp::Driver) ( ) perl(Getopt::Std) ( ) perl(:VERSION) ( >=  5.4.0)"
RPROVIDES:perl-Parse-Yapp = "perl(Parse::Yapp::Grammar) ( ) perl(Parse::Yapp::Lalr) ( ) perl(Parse::Yapp::Options) ( ) perl(Parse::Yapp::Output) ( ) perl(Parse::Yapp::Parse) ( ) perl(Parse::Yapp) ( =  1.21) perl(Parse::Yapp::Driver) ( =  1.21) perl-Parse-Yapp ( =  1.21-21.el10)"

URI_perl-Parse-Yapp-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Parse-Yapp-tests-1.21-21.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Parse-Yapp-tests = "/usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(Parse::Yapp) ( ) perl-Parse-Yapp ( =  1.21-21.el10)"
RPROVIDES:perl-Parse-Yapp-tests = "perl-Parse-Yapp-tests ( =  1.21-21.el10)"
