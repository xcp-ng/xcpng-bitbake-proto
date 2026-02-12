
inherit dnf-bridge

PN = "perl-Getopt-Long"
PE = "1"
PV = "2.58"
PR = "3.el10"
PACKAGES = "perl-Getopt-Long perl-Getopt-Long-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-Getopt-Long-2.58-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Getopt-Long = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Getopt-Long-2.58-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Getopt-Long}"
RDEPENDS:perl-Getopt-Long = " \
 perl-constant \
 perl-libs \
 perl-Text-ParseWords \
 perl-Getopt-Long \
 perl-overload \
 perl-Exporter \
 perl-base \
 perl-Pod-Usage \
"

URI_perl-Getopt-Long-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Getopt-Long-tests-2.58-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Getopt-Long-tests}"
RDEPENDS:perl-Getopt-Long-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Getopt-Long \
 perl-overload \
 bash \
 perl-interpreter \
"
