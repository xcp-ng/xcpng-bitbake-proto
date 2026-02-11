
inherit dnf-bridge

PN = "perl-Digest-SHA"
PE = "1"
PV = "6.04"
PR = "512.el10"
PACKAGES = "perl-Digest-SHA perl-Digest-SHA-tests"


URI_perl-Digest-SHA = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Digest-SHA-6.04-512.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Digest-SHA = " \
 perl-libs \
 perl-Carp \
 perl-interpreter \
 perl-vars \
 perl-Digest \
 perl-Digest-SHA \
 perl-Fcntl \
 perl-Getopt-Long \
 perl-PathTools \
 glibc \
 perl-Exporter \
"

URI_perl-Digest-SHA-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Digest-SHA-tests-6.04-512.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Digest-SHA-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-vars \
 perl-FileHandle \
 perl-Digest-SHA \
 bash \
 perl-interpreter \
"
