
PN = "perl-List-MoreUtils"
PE = "0"
PV = "0.430"
PR = "15.el10"
PACKAGES = "perl-List-MoreUtils perl-List-MoreUtils-tests"


URI_perl-List-MoreUtils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-List-MoreUtils-0.430-15.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-List-MoreUtils = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(vars) ( ) perl(parent) ( ) perl(Exporter::Tiny) ( ) perl(List::MoreUtils::PP) ( ) perl(:VERSION) ( >=  5.8.0) perl(List::MoreUtils::XS) ( >=  0.430)"
RPROVIDES:perl-List-MoreUtils = "perl(List::MoreUtils) ( =  0.430) perl(List::MoreUtils::PP) ( =  0.430) perl-List-MoreUtils ( =  0.430-15.el10)"

URI_perl-List-MoreUtils-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-List-MoreUtils-tests-0.430-15.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-List-MoreUtils-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(lib) ( ) perl(Exporter) ( ) perl(Carp) ( ) perl(base) ( ) perl(overload) ( ) perl(Scalar::Util) ( ) perl(POSIX) ( ) perl(List::Util) ( ) perl(Tie::Array) ( ) perl(Math::Trig) ( ) perl(Test::Builder::Module) ( ) perl(List::MoreUtils) ( ) perl-List-MoreUtils ( =  0.430-15.el10)"
RPROVIDES:perl-List-MoreUtils-tests = "perl-List-MoreUtils-tests ( =  0.430-15.el10)"
