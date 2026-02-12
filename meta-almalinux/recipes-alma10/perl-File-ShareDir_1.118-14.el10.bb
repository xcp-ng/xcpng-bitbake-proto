
inherit dnf-bridge

PN = "perl-File-ShareDir"
PE = "0"
PV = "1.118"
PR = "14.el10"
PACKAGES = "perl-File-ShareDir perl-File-ShareDir-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-File-ShareDir-1.118-14.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-File-ShareDir = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-File-ShareDir-1.118-14.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-File-ShareDir}"
RDEPENDS:perl-File-ShareDir = " \
 perl-constant \
 perl-libs \
 perl-Carp \
 perl-Class-Inspector \
 perl-PathTools \
 perl-Exporter \
 perl-base \
"

URI_perl-File-ShareDir-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-File-ShareDir-tests-1.118-14.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-File-ShareDir-tests}"
RDEPENDS:perl-File-ShareDir-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-File-Basename \
 perl-POSIX \
 bash \
 perl-PathTools \
 perl-parent \
 perl-interpreter \
 perl-File-Path \
 perl-File-ShareDir \
"
