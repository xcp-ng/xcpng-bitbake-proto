
inherit dnf-bridge

PN = "perl-Pod-Perldoc"
PE = "0"
PV = "3.28.01"
PR = "512.el10"
PACKAGES = "perl-Pod-Perldoc perl-Pod-Perldoc-tests"


URI_perl-Pod-Perldoc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Pod-Perldoc-3.28.01-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Pod-Perldoc = " \
 perl-libs \
 perl-Symbol \
 perl-parent \
 perl-podlators \
 perl-HTTP-Tiny \
 perl-Carp \
 perl-vars \
 perl-IO \
 perl-Text-ParseWords \
 perl-IPC-Open3 \
 perl-Pod-Simple \
 groff-base \
 perl-Encode \
 perl-Fcntl \
 perl-File-Basename \
 perl-PathTools \
 perl-interpreter \
 perl-Pod-Perldoc \
 perl-File-Temp \
"

URI_perl-Pod-Perldoc-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Pod-Perldoc-tests-3.28.01-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Pod-Perldoc-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-vars \
 bash \
 perl-parent \
 perl-interpreter \
 perl-Pod-Perldoc \
"
