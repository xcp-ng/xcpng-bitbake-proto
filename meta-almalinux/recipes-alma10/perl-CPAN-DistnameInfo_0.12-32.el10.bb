
PN = "perl-CPAN-DistnameInfo"
PE = "0"
PV = "0.12"
PR = "32.el10"
PACKAGES = "perl-CPAN-DistnameInfo perl-CPAN-DistnameInfo-tests"


URI_perl-CPAN-DistnameInfo = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-CPAN-DistnameInfo-0.12-32.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-CPAN-DistnameInfo = "perl(strict) ( ) perl-libs ( )"
RPROVIDES:perl-CPAN-DistnameInfo = "perl(CPAN::DistnameInfo) ( =  0.12) perl-CPAN-DistnameInfo ( =  0.12-32.el10)"

URI_perl-CPAN-DistnameInfo-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-CPAN-DistnameInfo-tests-0.12-32.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-CPAN-DistnameInfo-tests = "/usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(Test::More) ( ) perl(Data::Dumper) ( ) perl(CPAN::DistnameInfo) ( ) perl-CPAN-DistnameInfo ( =  0.12-32.el10)"
RPROVIDES:perl-CPAN-DistnameInfo-tests = "perl-CPAN-DistnameInfo-tests ( =  0.12-32.el10)"
