
PN = "perl-Sub-Install"
PE = "0"
PV = "0.929"
PR = "8.el10"
PACKAGES = "perl-Sub-Install perl-Sub-Install-tests"


URI_perl-Sub-Install = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Sub-Install-0.929-8.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Sub-Install = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(Scalar::Util) ( ) perl(B) ( ) perl(:VERSION) ( >=  5.8.0)"
RPROVIDES:perl-Sub-Install = "perl(Sub::Install) ( =  0.929) perl-Sub-Install ( =  0.929-8.el10)"

URI_perl-Sub-Install-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Sub-Install-tests-0.929-8.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Sub-Install-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(File::Spec) ( ) perl(ExtUtils::MakeMaker) ( ) perl(Scalar::Util) ( ) perl(Sub::Install) ( ) perl-Sub-Install ( =  0.929-8.el10)"
RPROVIDES:perl-Sub-Install-tests = "perl-Sub-Install-tests ( =  0.929-8.el10)"
