
PN = "perl-File-Remove"
PE = "0"
PV = "1.61"
PR = "10.el10"
PACKAGES = "perl-File-Remove perl-File-Remove-tests"


URI_perl-File-Remove = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-File-Remove-1.61-10.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-Remove = "
 perl-constant
 perl-libs
 perl-vars
 perl-PathTools
 perl-File-Path
"

URI_perl-File-Remove-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-File-Remove-tests-1.61-10.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-Remove-tests = "
 perl-Test-Harness
 perl-libs
 perl-Test-Simple
 perl-IO
 perl-IPC-Open3
 perl-File-Copy
 bash
 perl-PathTools
 perl-interpreter
 perl-File-Path
 perl-File-Remove
"
