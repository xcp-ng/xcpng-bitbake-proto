
inherit dnf-bridge

PN = "perl-Path-Tiny"
PE = "0"
PV = "0.144"
PR = "9.el10"
PACKAGES = "perl-Path-Tiny perl-Path-Tiny-tests"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/perl-Path-Tiny-0.144-9.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Path-Tiny = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Path-Tiny-0.144-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Path-Tiny}"
RDEPENDS:perl-Path-Tiny = " \
 perl-constant \
 perl-threads \
 perl-File-stat \
 perl-libs \
 perl-Carp \
 perl-Digest \
 perl-Digest-SHA \
 perl-Unicode-UTF8 \
 perl-Fcntl \
 perl-Encode \
 perl-overload \
 perl-File-Copy \
 perl-PathTools \
 perl-File-Compare \
 perl-Exporter \
 perl-File-Path \
 perl-File-Temp \
"

URI_perl-Path-Tiny-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Path-Tiny-tests-0.144-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Path-Tiny-tests}"
RDEPENDS:perl-Path-Tiny-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Carp \
 perl-ExtUtils-MakeMaker \
 perl-Digest \
 perl-Test-Simple \
 perl-Digest-MD5 \
 perl-Fcntl \
 perl-Path-Tiny \
 perl-File-Basename \
 perl-open \
 perl-File-Temp \
 perl-PathTools \
 bash \
 perl-interpreter \
 perl-Exporter \
 perl-lib \
"
