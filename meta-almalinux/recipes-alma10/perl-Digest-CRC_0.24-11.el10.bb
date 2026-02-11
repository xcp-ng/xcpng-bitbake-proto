
inherit dnf-bridge

PN = "perl-Digest-CRC"
PE = "0"
PV = "0.24"
PR = "11.el10"
PACKAGES = "perl-Digest-CRC perl-Digest-CRC-tests"


URI_perl-Digest-CRC = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Digest-CRC-0.24-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Digest-CRC = " \
 perl-libs \
 perl-vars \
 perl-DynaLoader \
 perl-Symbol \
 glibc \
 perl-Exporter \
"

URI_perl-Digest-CRC-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Digest-CRC-tests-0.24-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Digest-CRC-tests = " \
 perl-Test-Harness \
 perl-Fcntl \
 bash \
 perl-Digest-CRC \
 perl-interpreter \
"
