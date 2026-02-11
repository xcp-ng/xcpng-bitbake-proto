
inherit dnf-bridge

PN = "perl-Unix-Syslog"
PE = "0"
PV = "1.1"
PR = "53.el10"
PACKAGES = "perl-Unix-Syslog perl-Unix-Syslog-tests"


URI_perl-Unix-Syslog = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Unix-Syslog-1.1-53.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Unix-Syslog = " \
 systemd \
 perl-libs \
 perl-vars \
 perl-DynaLoader \
 glibc \
 perl-Exporter \
"

URI_perl-Unix-Syslog-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Unix-Syslog-tests-1.1-53.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Unix-Syslog-tests = " \
 perl-Unix-Syslog \
 perl-interpreter \
 perl-Test-Harness \
 bash \
"
