
PN = "perl-CPAN"
PE = "0"
PV = "2.36"
PR = "514.el10_0"
PACKAGES = "perl-CPAN perl-CPAN-tests"


URI_perl-CPAN = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-CPAN-2.36-514.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-CPAN = "
 perl-libnet
 perl-Safe
 perl-libs
 perl-FileHandle
 perl-local-lib
 perl
 perl-Archive-Tar
 perl-Archive-Zip
 perl-Getopt-Std
 perl-overload
 perl-Sys-Hostname
 perl-HTTP-Tiny
 perl-Term-ReadLine
 perl-CPAN
 perl-CPAN-Meta
 perl-CPAN-Meta-Requirements
 perl-Carp
 perl-vars
 perl-IO-Compress
 perl-Compress-Bzip2
 perl-Text-ParseWords
 perl-Text-Glob
 perl-Text-Tabs+Wrap
 perl-File-Temp
 perl-Data-Dumper
 perl-Time-Local
 perl-URI
 perl-Devel-Size
 perl-Digest-MD5
 perl-Digest-SHA
 perl-Module-Build
 perl-DirHandle
 perl-User-pwent
 perl-Dumpvalue
 perl-Module-Signature
 perl-Errno
 perl-Exporter
 perl-autouse
 perl-ExtUtils-CBuilder
 perl-base
 perl-Net-Ping
 perl-constant
 perl-ExtUtils-MakeMaker
 perl-ExtUtils-Manifest
 perl-Fcntl
 make
 perl-POSIX
 perl-File-Basename
 perl-File-Copy
 perl-PathTools
 perl-if
 perl-File-Find
 perl-File-HomeDir
 perl-interpreter
 perl-File-Path
 perl-lib
"

URI_perl-CPAN-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-CPAN-tests-2.36-514.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-CPAN-tests = "
 perl-Test-Harness
 perl-libs
 perl-Test-Simple
 perl-Carp
 perl-vars
 perl-version
 perl-File-Basename
 perl-CPAN
 perl-File-Temp
 perl-File-Copy
 bash
 perl-PathTools
 perl-interpreter
 perl-File-Path
 perl-lib
 perl-File-Which
"
