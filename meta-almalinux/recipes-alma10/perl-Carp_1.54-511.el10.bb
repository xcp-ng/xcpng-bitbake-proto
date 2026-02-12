
inherit dnf-bridge

PN = "perl-Carp"
PE = "0"
PV = "1.54"
PR = "511.el10"
PACKAGES = "perl-Carp perl-Carp-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-Carp-1.54-511.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Carp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Carp-1.54-511.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Carp}"
RDEPENDS:perl-Carp = " \
 perl-Exporter \
 perl-libs \
 perl-Carp \
"

URI_perl-Carp-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Carp-tests-1.54-511.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Carp-tests}"
RDEPENDS:perl-Carp-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Carp \
 perl-overload \
 perl-IPC-Open3 \
 bash \
 perl-interpreter \
 perl-Data-Dumper \
"
