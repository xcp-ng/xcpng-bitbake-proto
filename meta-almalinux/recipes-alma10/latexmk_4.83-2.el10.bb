
inherit dnf-bridge

PN = "latexmk"
PE = "0"
PV = "4.83"
PR = "2.el10"
PACKAGES = "latexmk"


URI_latexmk = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/latexmk-4.83-2.el10.noarch.rpm;unpack=0"
RDEPENDS:latexmk = " \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-File-Path \
 perl-FileHandle \
 perl-Unicode-Normalize \
 perl-Digest-MD5 \
 xdg-utils \
 perl-File-Basename \
 perl-Encode \
 texlive-latex \
 perl-File-Copy \
 perl-PathTools \
 perl-File-Find \
 perl-interpreter \
 perl-sigtrap \
 ghostscript \
 perl-Time-HiRes \
"
