
inherit dnf-bridge

PN = "perl-LWP-MediaTypes"
PE = "0"
PV = "6.04"
PR = "19.el10"
PACKAGES = "perl-LWP-MediaTypes perl-LWP-MediaTypes-tests"


URI_perl-LWP-MediaTypes = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-LWP-MediaTypes-6.04-19.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-LWP-MediaTypes = " \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Carp \
 mailcap \
 perl-File-Basename \
 perl-Exporter \
"

URI_perl-LWP-MediaTypes-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-LWP-MediaTypes-tests-6.04-19.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-LWP-MediaTypes-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-overload \
 bash \
 perl-LWP-MediaTypes \
 perl-interpreter \
 perl-Test-Fatal \
"
