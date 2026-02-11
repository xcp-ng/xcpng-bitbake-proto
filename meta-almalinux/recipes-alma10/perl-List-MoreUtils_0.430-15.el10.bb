
PN = "perl-List-MoreUtils"
PE = "0"
PV = "0.430"
PR = "15.el10"
PACKAGES = "perl-List-MoreUtils perl-List-MoreUtils-tests"


URI_perl-List-MoreUtils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-List-MoreUtils-0.430-15.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-List-MoreUtils = "
 perl-libs
 perl-Carp
 perl-vars
 perl-List-MoreUtils-XS
 perl-parent
 perl-List-MoreUtils
 perl-Exporter-Tiny
"

URI_perl-List-MoreUtils-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-List-MoreUtils-tests-0.430-15.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-List-MoreUtils-tests = "
 perl-List-MoreUtils
 perl-Test-Harness
 perl-libs
 perl-Test-Simple
 perl-Carp
 perl-Scalar-List-Utils
 perl-Math-Complex
 perl-POSIX
 perl-overload
 bash
 perl-base
 perl-Tie
 perl-interpreter
 perl-Exporter
 perl-lib
"
