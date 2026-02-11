
PN = "perl-Fedora-VSP"
PE = "0"
PV = "0.001"
PR = "36.el10"
PACKAGES = "perl-Fedora-VSP perl-Fedora-VSP-tests"


URI_perl-Fedora-VSP = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Fedora-VSP-0.001-36.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Fedora-VSP = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( )"
RPROVIDES:perl-Fedora-VSP = "perl(Fedora::VSP) ( =  0.001) perl-Fedora-VSP ( =  0.001-36.el10)"

URI_perl-Fedora-VSP-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Fedora-VSP-tests-0.001-36.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Fedora-VSP-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(version) ( ) perl(Fedora::VSP) ( ) perl-Fedora-VSP ( =  0.001-36.el10)"
RPROVIDES:perl-Fedora-VSP-tests = "perl-Fedora-VSP-tests ( =  0.001-36.el10)"
