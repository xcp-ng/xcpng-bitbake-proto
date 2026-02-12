
inherit dnf-bridge

PN = "perl-Sys-Syslog"
PE = "0"
PV = "0.36"
PR = "512.el10"
PACKAGES = "perl-Sys-Syslog perl-Sys-Syslog-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-Sys-Syslog-0.36-512.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Sys-Syslog = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Sys-Syslog-0.36-512.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_perl-Sys-Syslog}"
RDEPENDS:perl-Sys-Syslog = " \
 perl-constant \
 perl-libs \
 perl-Carp \
 perl-vars \
 perl-Socket \
 perl-Fcntl \
 perl-POSIX \
 perl-File-Basename \
 glibc \
 perl-Exporter \
"

URI_perl-Sys-Syslog-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Sys-Syslog-tests-0.36-512.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_perl-Sys-Syslog-tests}"
RDEPENDS:perl-Sys-Syslog-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-FileHandle \
 perl-Socket \
 bash \
 perl-PathTools \
 perl-Sys-Syslog \
 perl-interpreter \
"
