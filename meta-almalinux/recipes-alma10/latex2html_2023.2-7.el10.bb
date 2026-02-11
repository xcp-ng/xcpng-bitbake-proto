
PN = "latex2html"
PE = "0"
PV = "2023.2"
PR = "7.el10"
PACKAGES = "latex2html"


URI_latex2html = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/latex2html-2023.2-7.el10.noarch.rpm;unpack=0"
RDEPENDS:latex2html = "/bin/sh ( ) perl(strict) ( ) perl(Exporter) ( ) perl(Carp) ( ) /usr/bin/perl ( ) perl(vars) ( ) perl(Getopt::Long) ( ) perl(Cwd) ( ) perl(Fcntl) ( ) perl(POSIX) ( ) perl(Encode) ( ) perl(File::Copy) ( ) perl(Sys::Hostname) ( ) tex(latex) ( ) netpbm-progs ( ) tex(dvips) ( ) perl(AnyDBM_File) ( ) poppler-utils ( ) tex(preview.sty) ( ) tex(url.sty) ( ) perl(:VERSION) ( >=  5.3.0)"
RPROVIDES:latex2html = "perl(L2hos) ( ) perl(L2hos::Unix) ( ) perl(cfgcache) ( ) perl(prefs) ( ) latex2html ( =  2023.2-7.el10)"
