
inherit dnf-bridge

PN = "perl-IPC-Cmd"
PE = "2"
PV = "1.04"
PR = "512.el10"
PACKAGES = "perl-IPC-Cmd perl-IPC-Cmd-tests"


URI_perl-IPC-Cmd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-IPC-Cmd-1.04-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-IPC-Cmd = " \
 perl-constant \
 perl-ExtUtils-MM-Utils \
 perl-libs \
 perl-Carp \
 perl-vars \
 perl-IO \
 perl-FileHandle \
 perl-Socket \
 perl-Text-ParseWords \
 perl-Module-Load-Conditional \
 perl-POSIX \
 perl-Params-Check \
 perl-Symbol \
 perl-IPC-Open3 \
 perl-PathTools \
 perl-Locale-Maketext-Simple \
 perl-Exporter \
 perl-Time-HiRes \
"

URI_perl-IPC-Cmd-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-IPC-Cmd-tests-1.04-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-IPC-Cmd-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-IPC-Cmd \
 perl-File-Temp \
 bash \
 perl-PathTools \
 perl-interpreter \
 perl-Data-Dumper \
 perl-lib \
"
