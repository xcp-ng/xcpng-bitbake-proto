
inherit dnf-bridge

PN = "perl-Exporter"
PE = "0"
PV = "5.78"
PR = "511.el10"
PACKAGES = "perl-Exporter perl-Exporter-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-Exporter-5.78-511.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Exporter = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Exporter-5.78-511.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Exporter}"
RDEPENDS:perl-Exporter = " \
 perl-libs \
 perl-Carp \
"

URI_perl-Exporter-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Exporter-tests-5.78-511.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Exporter-tests}"
RDEPENDS:perl-Exporter-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Carp \
 perl-vars \
 bash \
 perl-interpreter \
 perl-Exporter \
"
