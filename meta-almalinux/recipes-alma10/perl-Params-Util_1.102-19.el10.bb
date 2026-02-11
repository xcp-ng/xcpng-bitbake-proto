
PN = "perl-Params-Util"
PE = "0"
PV = "1.102"
PR = "19.el10"
PACKAGES = "perl-Params-Util perl-Params-Util-tests"


URI_perl-Params-Util = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Params-Util-1.102-19.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Params-Util = "
 perl-Scalar-List-Utils
 perl-libs
 perl-overload
 perl-Params-Util
 perl-parent
 glibc
 perl-Exporter
"

URI_perl-Params-Util-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Params-Util-tests-1.102-19.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Params-Util-tests = "
 perl-Test-Harness
 perl-libs
 perl-Test-Simple
 perl-vars
 perl-overload
 perl-Params-Util
 bash
 perl-PathTools
 perl-interpreter
"
