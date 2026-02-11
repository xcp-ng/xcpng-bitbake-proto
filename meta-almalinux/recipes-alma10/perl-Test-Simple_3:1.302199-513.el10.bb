
inherit dnf-bridge

PN = "perl-Test-Simple"
PE = "3"
PV = "1.302199"
PR = "513.el10"
PACKAGES = "perl-Test-Simple perl-Test-Simple-tests"


URI_perl-Test-Simple = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Test-Simple-1.302199-513.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-Simple = " \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Storable \
 perl-mro \
 perl-Symbol \
 perl-Term-ANSIColor \
 perl-Term-Table \
 perl-Carp \
 perl-Test-Simple \
 perl-vars \
 perl-IO \
 perl-JSON-PP \
 perl-Data-Dumper \
 perl-Time-HiRes \
 perl-Exporter \
 perl-base \
 perl-POSIX \
 perl-PathTools \
 perl-File-Temp \
"

URI_perl-Test-Simple-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Test-Simple-tests-1.302199-513.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-Simple-tests = " \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-overload \
 perl-Symbol \
 perl-threads \
 perl-Test-Harness \
 perl-Test-Simple \
 perl-Carp \
 perl-vars \
 perl-IO \
 perl-IPC-Open3 \
 perl-lib \
 perl-Data-Dumper \
 bash \
 perl-Exporter \
 perl-base \
 perl-File-Basename \
 perl-PathTools \
 perl-interpreter \
 perl-File-Temp \
"
