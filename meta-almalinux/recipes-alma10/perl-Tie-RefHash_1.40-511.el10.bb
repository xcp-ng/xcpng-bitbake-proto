
PN = "perl-Tie-RefHash"
PE = "0"
PV = "1.40"
PR = "511.el10"
PACKAGES = "perl-Tie-RefHash perl-Tie-RefHash-tests"


URI_perl-Tie-RefHash = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Tie-RefHash-1.40-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Tie-RefHash = "perl(strict) ( ) perl-libs ( ) perl(Carp) ( ) perl(Config) ( ) perl(overload) ( ) perl(Tie::Hash) ( )"
RPROVIDES:perl-Tie-RefHash = "perl(Tie::RefHash) ( =  1.40) perl-Tie-RefHash ( =  1.40-511.el10)"

URI_perl-Tie-RefHash-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Tie-RefHash-tests-1.40-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Tie-RefHash-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(File::Spec) ( ) perl(Config) ( ) perl(Data::Dumper) ( ) perl(overload) ( ) perl(ExtUtils::MakeMaker) ( ) perl(threads) ( ) perl(Storable) ( ) perl(Tie::RefHash) ( ) perl-Tie-RefHash ( =  1.40-511.el10)"
RPROVIDES:perl-Tie-RefHash-tests = "perl-Tie-RefHash-tests ( =  1.40-511.el10)"
