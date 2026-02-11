
PN = "perl-Package-Generator"
PE = "0"
PV = "1.106"
PR = "34.el10"
PACKAGES = "perl-Package-Generator perl-Package-Generator-tests"


URI_perl-Package-Generator = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Package-Generator-1.106-34.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Package-Generator = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(Scalar::Util) ( ) perl(Symbol) ( ) perl(:VERSION) ( >=  5.8.0)"
RPROVIDES:perl-Package-Generator = "perl(Package::Generator) ( =  1.106) perl(Package::Reaper) ( =  1.106) perl-Package-Generator ( =  1.106-34.el10)"

URI_perl-Package-Generator-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Package-Generator-tests-1.106-34.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Package-Generator-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( >=  0.88) perl-Package-Generator ( =  1.106-34.el10)"
RPROVIDES:perl-Package-Generator-tests = "perl-Package-Generator-tests ( =  1.106-34.el10)"
