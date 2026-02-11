
PN = "perl-Tk"
PE = "0"
PV = "804.036"
PR = "17.el10"
PACKAGES = "perl-Tk perl-Tk-devel perl-Tk-tests"


URI_perl-Tk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Tk-804.036-17.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Tk = "
 perl-libs
 libpng
 perl-locale
 perl-Socket
 perl-Getopt-Long
 fontconfig
 libX11
 perl-Getopt-Std
 perl-overload
 perl-Symbol
 perl-AutoLoader
 perl-open
 perl-subs
 perl-Carp
 libXft
 perl-vars
 perl-IO
 perl-Text-Tabs+Wrap
 perl-Tk
 perl-DirHandle
 perl-DynaLoader
 perl-Encode
 perl-Exporter
 perl-base
 perl-File-Basename
 perl-PathTools
 perl-if
 glibc
 perl-interpreter
 libjpeg-turbo
"

URI_perl-Tk-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Tk-devel-804.036-17.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Tk-devel = "
 perl-Tk
 perl-libs
 perl-Carp
 perl-vars
 perl-ExtUtils-MakeMaker
 perl-Tk-devel
 perl-File-Basename
 perl-PathTools
 perl-Exporter
 perl-base
"

URI_perl-Tk-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Tk-tests-804.036-17.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Tk-tests = "
 perl-libs
 perl-FindBin
 perl-Getopt-Long
 mutter
 default-fonts-core-sans
 perl-subs
 perl-Test
 perl-Test-Harness
 perl-Test-Simple
 perl-Carp
 perl-vars
 perl-IO
 liberation-sans-fonts
 perl-lib
 perl-Data-Dumper
 xwayland-run
 perl-Devel-Peek
 perl-Tk
 mesa-dri-drivers
 perl-Encode
 bash
 google-noto-sans-fonts
 perl-Exporter
 perl-base
 perl-constant
 perl-POSIX
 perl-File-Copy
 perl-PathTools
 perl-interpreter
 perl-File-Temp
"
