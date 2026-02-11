
PN = "irssi"
PE = "0"
PV = "1.4.5"
PR = "6.el10"
PACKAGES = "irssi irssi-devel"


URI_irssi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/irssi-1.4.5-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:irssi = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) perl(strict) ( ) perl-libs ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) perl(Carp) ( ) perl(Exporter) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libperl.so.5.40()(64bit) ( ) perl(vars) ( ) libresolv.so.2()(64bit) ( ) libgmodule-2.0.so.0()(64bit) ( ) libcrypt.so.2()(64bit) ( ) libtinfo.so.6()(64bit) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) perl(lib) ( ) perl(Symbol) ( ) perl(DynaLoader) ( ) libutf8proc.so.2()(64bit) ( )"
RPROVIDES:irssi = "libfe_perl.so()(64bit) ( ) libirc_proxy.so()(64bit) ( ) libperl_core.so()(64bit) ( ) config(irssi) ( =  1.4.5-6.el10) irssi ( =  1.4.5-6.el10) irssi(x86-64) ( =  1.4.5-6.el10) perl(Irssi) ( =  0.9) perl(Irssi::Irc) ( =  0.9) perl(Irssi::TextUI) ( =  0.9) perl(Irssi::UI) ( =  0.9)"

URI_irssi-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/irssi-devel-1.4.5-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:irssi-devel = "/usr/bin/pkg-config ( ) pkgconfig(glib-2.0) ( ) pkgconf-pkg-config ( ) irssi ( =  1.4.5-6.el10)"
RPROVIDES:irssi-devel = "irssi-devel ( =  1.4.5-6.el10) irssi-devel(x86-64) ( =  1.4.5-6.el10) pkgconfig(irssi-1) ( =  1.4.5)"
