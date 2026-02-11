
PN = "perl-IPC-Run"
PE = "0"
PV = "20231003.0"
PR = "6.el10"
PACKAGES = "perl-IPC-Run perl-IPC-Run-tests"


URI_perl-IPC-Run = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-IPC-Run-20231003.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-IPC-Run = "
 perl-IO-Tty
 perl-constant
 perl-IPC-Run
 perl-Scalar-List-Utils
 perl-libs
 perl-Carp
 perl-vars
 perl-IO
 perl-Fcntl
 perl-File-Basename
 perl-POSIX
 perl-Symbol
 perl-PathTools
 perl-Errno
 perl-Exporter
 perl-Data-Dumper
"

URI_perl-IPC-Run-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-IPC-Run-tests-20231003.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-IPC-Run-tests = "
 perl-IPC-Run
 perl-Test-Harness
 perl-libs
 perl-Test-Simple
 perl-vars
 perl-IO
 perl-POSIX
 perl-Encode
 bash
 perl-PathTools
 perl-interpreter
 perl-Data-Dumper
 perl-Exporter
 perl-File-Temp
"
