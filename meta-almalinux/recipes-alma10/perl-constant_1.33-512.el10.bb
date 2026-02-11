
PN = "perl-constant"
PE = "0"
PV = "1.33"
PR = "512.el10"
PACKAGES = "perl-constant perl-constant-tests"


URI_perl-constant = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-constant-1.33-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-constant = "perl(strict) ( ) perl-libs ( ) perl(Carp) ( ) perl(warnings::register) ( ) perl(:VERSION) ( >=  5.8.0)"
RPROVIDES:perl-constant = "perl(constant) ( =  1.33) perl-constant ( =  1.33-512.el10)"

URI_perl-constant-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-constant-tests-1.33-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-constant-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(vars) ( ) perl(utf8) ( ) perl(constant) ( >=  1.01) perl-constant ( =  1.33-512.el10)"
RPROVIDES:perl-constant-tests = "perl-constant-tests ( =  1.33-512.el10)"
