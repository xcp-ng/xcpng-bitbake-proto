
PN = "perl-File-BaseDir"
PE = "0"
PV = "0.09"
PR = "11.el10"
PACKAGES = "perl-File-BaseDir perl-File-BaseDir-tests perl-File-UserDirs"


URI_perl-File-BaseDir = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-File-BaseDir-0.09-11.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-BaseDir = " \
 perl-File-BaseDir \
 perl-PathTools \
 perl-libs \
 perl-Exporter \
"

URI_perl-File-BaseDir-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-File-BaseDir-tests-0.09-11.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-BaseDir-tests = " \
 perl-File-UserDirs \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 xdg-user-dirs \
 perl-File-Temp \
 bash \
 perl-PathTools \
 perl-File-BaseDir \
 perl-interpreter \
 perl-File-Path \
 perl-Exporter \
 perl-lib \
 perl-File-Which \
"

URI_perl-File-UserDirs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-File-UserDirs-0.09-11.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-UserDirs = " \
 xdg-user-dirs \
 perl-IPC-System-Simple \
 perl-libs \
 perl-Exporter \
"
