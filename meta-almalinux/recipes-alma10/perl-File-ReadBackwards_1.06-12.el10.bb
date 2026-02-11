
PN = "perl-File-ReadBackwards"
PE = "0"
PV = "1.06"
PR = "12.el10"
PACKAGES = "perl-File-ReadBackwards perl-File-ReadBackwards-tests"


URI_perl-File-ReadBackwards = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-File-ReadBackwards-1.06-12.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-ReadBackwards = "perl(strict) ( ) perl-libs ( ) perl(Carp) ( ) perl(Fcntl) ( ) perl(Symbol) ( )"
RPROVIDES:perl-File-ReadBackwards = "perl(File::ReadBackwards) ( =  1.06) perl-File-ReadBackwards ( =  1.06-12.el10)"

URI_perl-File-ReadBackwards-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-File-ReadBackwards-tests-1.06-12.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-ReadBackwards-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(Config) ( ) perl(Carp) ( ) perl(File::Temp) ( ) perl(Fcntl) ( ) perl(File::ReadBackwards) ( ) perl-File-ReadBackwards ( =  1.06-12.el10)"
RPROVIDES:perl-File-ReadBackwards-tests = "perl-File-ReadBackwards-tests ( =  1.06-12.el10)"
