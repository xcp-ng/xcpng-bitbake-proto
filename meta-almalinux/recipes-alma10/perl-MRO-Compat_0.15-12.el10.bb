
PN = "perl-MRO-Compat"
PE = "0"
PV = "0.15"
PR = "12.el10"
PACKAGES = "perl-MRO-Compat perl-MRO-Compat-tests"


URI_perl-MRO-Compat = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-MRO-Compat-0.15-12.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-MRO-Compat = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(:VERSION) ( >=  5.6.0)"
RPROVIDES:perl-MRO-Compat = "perl(MRO::Compat) ( =  0.15) perl-MRO-Compat ( =  0.15-12.el10)"

URI_perl-MRO-Compat-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-MRO-Compat-tests-0.15-12.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-MRO-Compat-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(MRO::Compat) ( ) perl-MRO-Compat ( =  0.15-12.el10)"
RPROVIDES:perl-MRO-Compat-tests = "perl-MRO-Compat-tests ( =  0.15-12.el10)"
