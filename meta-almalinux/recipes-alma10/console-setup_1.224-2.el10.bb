
PN = "console-setup"
PE = "0"
PV = "1.224"
PR = "2.el10"
PACKAGES = "bdf2psf console-setup"


URI_bdf2psf = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/bdf2psf-1.224-2.el10.noarch.rpm;unpack=0"
RDEPENDS:bdf2psf = "perl(strict) ( ) /usr/bin/perl ( ) perl(warnings) ( )"
RPROVIDES:bdf2psf = "bdf2psf ( =  1.224-2.el10)"

URI_console-setup = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/console-setup-1.224-2.el10.noarch.rpm;unpack=0"
RDEPENDS:console-setup = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl(warnings) ( ) kbd ( )"
RPROVIDES:console-setup = "config(console-setup) ( =  1.224-2.el10) console-setup ( =  1.224-2.el10)"
