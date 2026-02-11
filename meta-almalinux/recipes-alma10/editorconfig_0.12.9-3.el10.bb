
PN = "editorconfig"
PE = "0"
PV = "0.12.9"
PR = "3.el10"
PACKAGES = "editorconfig-libs editorconfig editorconfig-devel"


URI_editorconfig-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/editorconfig-libs-0.12.9-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:editorconfig-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libpcre2-8.so.0()(64bit) ( )"
RPROVIDES:editorconfig-libs = "libeditorconfig.so.0()(64bit) ( ) bundled(inih) ( =  0^20110627git328c3d4) bundled(uthash) ( =  2.1.0) editorconfig-libs ( =  0.12.9-3.el10) editorconfig-libs(x86-64) ( =  0.12.9-3.el10)"

URI_editorconfig = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/editorconfig-0.12.9-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:editorconfig = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libeditorconfig.so.0()(64bit) ( ) editorconfig-libs(x86-64) ( =  0.12.9-3.el10)"
RPROVIDES:editorconfig = "editorconfig ( =  0.12.9-3.el10) editorconfig(x86-64) ( =  0.12.9-3.el10)"

URI_editorconfig-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/editorconfig-devel-0.12.9-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:editorconfig-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) cmake ( ) libeditorconfig.so.0()(64bit) ( ) editorconfig-libs(x86-64) ( =  0.12.9-3.el10)"
RPROVIDES:editorconfig-devel = "cmake(EditorConfig) ( =  0.12.9) cmake(editorconfig) ( =  0.12.9) editorconfig-devel ( =  0.12.9-3.el10) editorconfig-devel(x86-64) ( =  0.12.9-3.el10) pkgconfig(editorconfig) ( =  0.12.9)"
