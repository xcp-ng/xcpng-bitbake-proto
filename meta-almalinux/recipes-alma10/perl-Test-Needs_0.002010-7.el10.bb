
PN = "perl-Test-Needs"
PE = "0"
PV = "0.002010"
PR = "7.el10"
PACKAGES = "perl-Test-Needs perl-Test-Needs-tests"


URI_perl-Test-Needs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Test-Needs-0.002010-7.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-Needs = "perl(strict) ( ) perl(warnings) ( ) perl-libs ( )"
RPROVIDES:perl-Test-Needs = "perl-Test-Needs ( =  0.002010-7.el10) perl(Test::Needs) ( =  0.002010)"

URI_perl-Test-Needs-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Test-Needs-tests-0.002010-7.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-Needs-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(lib) ( ) perl(Config) ( ) perl(IPC::Open3) ( ) perl(Test::Needs) ( ) perl-Test-Needs ( =  0.002010-7.el10)"
RPROVIDES:perl-Test-Needs-tests = "perl-Test-Needs-tests ( =  0.002010-7.el10)"
