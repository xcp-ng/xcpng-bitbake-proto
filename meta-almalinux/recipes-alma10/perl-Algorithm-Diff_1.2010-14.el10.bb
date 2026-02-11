
PN = "perl-Algorithm-Diff"
PE = "0"
PV = "1.2010"
PR = "14.el10"
PACKAGES = "perl-Algorithm-Diff perl-Algorithm-Diff-tests"


URI_perl-Algorithm-Diff = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Algorithm-Diff-1.2010-14.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Algorithm-Diff = "perl(strict) ( ) perl-libs ( ) perl(Carp) ( ) perl(Exporter) ( ) perl(vars) ( ) perl(integer) ( )"
RPROVIDES:perl-Algorithm-Diff = "perl(Algorithm::Diff::_impl) ( ) perl(Algorithm::Diff) ( =  1.201) perl(Algorithm::DiffOld) ( =  1.201) perl-Algorithm-Diff ( =  1.2010-14.el10)"

URI_perl-Algorithm-Diff-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Algorithm-Diff-tests-1.2010-14.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Algorithm-Diff-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(lib) ( ) perl(Data::Dumper) ( ) perl(Test) ( ) perl(Algorithm::Diff) ( ) perl-Algorithm-Diff ( =  1.2010-14.el10)"
RPROVIDES:perl-Algorithm-Diff-tests = "perl-Algorithm-Diff-tests ( =  1.2010-14.el10)"
