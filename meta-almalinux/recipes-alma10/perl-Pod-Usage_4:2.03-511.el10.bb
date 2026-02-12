
inherit dnf-bridge

PN = "perl-Pod-Usage"
PE = "4"
PV = "2.03"
PR = "511.el10"
PACKAGES = "perl-Pod-Usage perl-Pod-Usage-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-Pod-Usage-2.03-511.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Pod-Usage = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Pod-Usage-2.03-511.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Pod-Usage}"
RDEPENDS:perl-Pod-Usage = " \
 perl-libs \
 perl-Carp \
 perl-interpreter \
 perl-Getopt-Long \
 perl-PathTools \
 perl-podlators \
 perl-Exporter \
 perl-Pod-Perldoc \
 perl-Pod-Usage \
"

URI_perl-Pod-Usage-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Pod-Usage-tests-2.03-511.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Pod-Usage-tests}"
RDEPENDS:perl-Pod-Usage-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Carp \
 perl-vars \
 perl-ExtUtils-MakeMaker \
 perl-FileHandle \
 perl-File-Basename \
 perl-Pod-Parser \
 bash \
 perl-PathTools \
 perl-interpreter \
 perl-Exporter \
 perl-Pod-Usage \
"
