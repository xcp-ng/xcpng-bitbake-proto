
inherit dnf-bridge

PN = "perl-gettext"
PE = "0"
PV = "1.07"
PR = "35.el10"
PACKAGES = "perl-Locale-gettext perl-Locale-gettext-tests"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/perl-gettext-1.07-35.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Locale-gettext = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Locale-gettext-1.07-35.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_perl-Locale-gettext}"
RDEPENDS:perl-Locale-gettext = " \
 perl-libs \
 perl-Carp \
 perl-POSIX \
 perl-DynaLoader \
 glibc \
 perl-Exporter \
"

URI_perl-Locale-gettext-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Locale-gettext-tests-1.07-35.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_perl-Locale-gettext-tests}"
RDEPENDS:perl-Locale-gettext-tests = " \
 perl-Test \
 perl-Test-Harness \
 perl-libs \
 perl-Locale-gettext \
 bash \
 perl-interpreter \
"
