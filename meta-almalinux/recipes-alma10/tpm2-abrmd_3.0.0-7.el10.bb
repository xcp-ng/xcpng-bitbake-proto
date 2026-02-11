
PN = "tpm2-abrmd"
PE = "0"
PV = "3.0.0"
PR = "7.el10"
PACKAGES = "tpm2-abrmd tpm2-abrmd-devel"


URI_tpm2-abrmd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tpm2-abrmd-3.0.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tpm2-abrmd = "/bin/sh ( ) systemd ( ) tpm2-tss ( >=  2.4.0) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libtss2-tctildr.so.0()(64bit) ( ) libtss2-mu.so.0()(64bit) ( ) libtss2-rc.so.0()(64bit) ( ) libtss2-sys.so.1()(64bit) ( ) tpm2-abrmd-selinux ( if  selinux-policy-targeted)"
RPROVIDES:tpm2-abrmd = "libtss2-tcti-tabrmd.so.0()(64bit) ( ) tpm2-abrmd ( =  3.0.0-7.el10) tpm2-abrmd(x86-64) ( =  3.0.0-7.el10)"

URI_tpm2-abrmd-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/tpm2-abrmd-devel-3.0.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tpm2-abrmd-devel = "/usr/bin/pkg-config ( ) pkgconfig(glib-2.0) ( ) pkgconfig(gio-2.0) ( ) pkgconfig(tss2-mu) ( ) pkgconfig(tss2-sys) ( ) libtss2-tcti-tabrmd.so.0()(64bit) ( ) tpm2-abrmd(x86-64) ( =  3.0.0-7.el10) tpm2-tss-devel(x86-64) ( >=  2.4.0)"
RPROVIDES:tpm2-abrmd-devel = "pkgconfig(tss2-tcti-tabrmd) ( =  3.0.0) tpm2-abrmd-devel ( =  3.0.0-7.el10) tpm2-abrmd-devel(x86-64) ( =  3.0.0-7.el10)"
