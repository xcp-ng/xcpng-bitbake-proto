
PN = "perl-Archive-Tar"
PE = "0"
PV = "3.02"
PR = "512.el10"
PACKAGES = "perl-Archive-Tar perl-Archive-Tar-tests"


URI_perl-Archive-Tar = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Archive-Tar-3.02-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Archive-Tar = "
 perl-libs
 perl-Getopt-Long
 perl-Archive-Tar
 perl-Getopt-Std
 perl-Carp
 perl-vars
 perl-IO
 perl-IO-Compress
 perl-Text-Diff
 perl-IO-Compress-Lzma
 perl-IO-Zlib
 perl-Data-Dumper
 perl-Exporter
 perl-constant
 perl-File-Basename
 perl-PathTools
 perl-File-Find
 perl-interpreter
 perl-File-Path
 perl-Pod-Usage
"

URI_perl-Archive-Tar-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Archive-Tar-tests-3.02-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Archive-Tar-tests = "
 perl-Test-Harness
 perl-libs
 perl-Test-Simple
 perl-ExtUtils-MakeMaker
 perl-IO
 perl-FindBin
 perl-Archive-Tar
 perl-File-Basename
 perl-IPC-Cmd
 perl-File-Temp
 perl-File-Copy
 bash
 perl-PathTools
 perl-interpreter
 perl-File-Path
 perl-Data-Dumper
 perl-lib
"
