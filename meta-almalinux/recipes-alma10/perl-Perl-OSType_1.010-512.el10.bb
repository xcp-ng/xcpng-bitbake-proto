
PN = "perl-Perl-OSType"
PE = "0"
PV = "1.010"
PR = "512.el10"
PACKAGES = "perl-Perl-OSType perl-Perl-OSType-tests"


URI_perl-Perl-OSType = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Perl-OSType-1.010-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Perl-OSType = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Exporter) ( )"
RPROVIDES:perl-Perl-OSType = "perl(Perl::OSType) ( =  1.010) perl-Perl-OSType ( =  1.010-512.el10)"

URI_perl-Perl-OSType-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Perl-OSType-tests-1.010-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Perl-OSType-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(constant) ( ) perl(Test::More) ( >=  0.88) perl-Perl-OSType ( =  1.010-512.el10)"
RPROVIDES:perl-Perl-OSType-tests = "perl-Perl-OSType-tests ( =  1.010-512.el10)"
