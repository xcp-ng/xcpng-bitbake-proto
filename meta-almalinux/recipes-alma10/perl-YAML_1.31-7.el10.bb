
inherit dnf-bridge

PN = "perl-YAML"
PE = "0"
PV = "1.31"
PR = "7.el10"
PACKAGES = "perl-YAML perl-YAML-tests"


URI_perl-YAML = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-YAML-1.31-7.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-YAML = " \
 perl-constant \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Carp \
 perl-overload \
 perl-B \
 perl-Exporter \
"

URI_perl-YAML-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-YAML-tests-1.31-7.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-YAML-tests = " \
 perl-constant \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Test-Deep \
 bash \
 perl-B \
 perl-interpreter \
 perl-YAML \
"
