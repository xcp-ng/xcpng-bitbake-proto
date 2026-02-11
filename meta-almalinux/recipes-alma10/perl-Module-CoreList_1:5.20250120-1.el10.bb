
PN = "perl-Module-CoreList"
PE = "1"
PV = "5.20250120"
PR = "1.el10"
PACKAGES = "perl-Module-CoreList perl-Module-CoreList-tools perl-Module-CoreList-tests"


URI_perl-Module-CoreList = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Module-CoreList-5.20250120-1.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-CoreList = " \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Module-CoreList \
 perl-version \
"

URI_perl-Module-CoreList-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Module-CoreList-tools-5.20250120-1.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-CoreList-tools = " \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-version \
 perl-Module-CoreList \
 perl-Getopt-Long \
 perl-interpreter \
 perl-Pod-Usage \
"

URI_perl-Module-CoreList-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Module-CoreList-tests-5.20250120-1.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-CoreList-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Module-CoreList \
 perl-Module-CoreList-tools \
 bash \
 perl-interpreter \
"
