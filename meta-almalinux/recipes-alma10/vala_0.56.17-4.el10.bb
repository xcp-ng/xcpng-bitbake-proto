
PN = "vala"
PE = "0"
PV = "0.56.17"
PR = "4.el10"
PACKAGES = "libvala libvala-devel vala vala-doc valadoc valadoc-devel"


URI_libvala = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libvala-0.56.17-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvala = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgmodule-2.0.so.0()(64bit) ( )"
RPROVIDES:libvala = "libvala-0.56.so.0()(64bit) ( ) libvala(x86-64) ( =  0.56.17-4.el10) libvala ( =  0.56.17-4.el10)"

URI_libvala-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libvala-devel-0.56.17-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvala-devel = "/usr/bin/pkg-config ( ) pkgconfig(glib-2.0) ( ) pkgconfig(gobject-2.0) ( ) pkgconfig(gmodule-2.0) ( ) libvala-0.56.so.0()(64bit) ( ) libvala(x86-64) ( =  0.56.17-4.el10)"
RPROVIDES:libvala-devel = "libvala-devel ( =  0.56.17-4.el10) libvala-devel(x86-64) ( =  0.56.17-4.el10) pkgconfig(libvala-0.56) ( =  0.56.17) vala-devel ( =  0.56.17-4.el10)"

URI_vala = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/vala-0.56.17-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:vala = "/usr/bin/pkg-config ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/sh ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libvala-0.56.so.0()(64bit) ( ) libgmodule-2.0.so.0()(64bit) ( ) gobject-introspection-devel ( ) libvala(x86-64) ( =  0.56.17-4.el10)"
RPROVIDES:vala = "libvalaccodegen.so()(64bit) ( ) vala ( =  0.56.17-4.el10) vala(x86-64) ( =  0.56.17-4.el10) pkgconfig(vapigen) ( =  0.56.17) pkgconfig(vapigen-0.56) ( =  0.56.17) vala(api) ( =  0.56)"

URI_vala-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/vala-doc-0.56.17-4.el10.noarch.rpm;unpack=0"
RDEPENDS:vala-doc = "vala ( =  0.56.17-4.el10)"
RPROVIDES:vala-doc = "vala-doc ( =  0.56.17-4.el10)"

URI_valadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/valadoc-0.56.17-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:valadoc = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libvala-0.56.so.0()(64bit) ( ) libgmodule-2.0.so.0()(64bit) ( ) libcdt.so.5()(64bit) ( ) libcgraph.so.6()(64bit) ( ) libgvc.so.6()(64bit) ( ) libvalaccodegen.so()(64bit) ( ) libvala(x86-64) ( =  0.56.17-4.el10) vala(x86-64) ( =  0.56.17-4.el10)"
RPROVIDES:valadoc = "libvaladoc-0.56.so.0()(64bit) ( ) libdoclet.so()(64bit) ( ) valadoc(x86-64) ( =  0.56.17-4.el10) valadoc ( =  0.56.17-4.el10)"

URI_valadoc-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/valadoc-devel-0.56.17-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:valadoc-devel = "/usr/bin/pkg-config ( ) pkgconfig(gobject-2.0) ( ) pkgconfig(gmodule-2.0) ( ) libvaladoc-0.56.so.0()(64bit) ( ) pkgconfig(libgvc) ( ) pkgconfig(libvala-0.56) ( ) valadoc(x86-64) ( =  0.56.17-4.el10)"
RPROVIDES:valadoc-devel = "pkgconfig(valadoc-0.56) ( =  0.56.17) valadoc-devel ( =  0.56.17-4.el10) valadoc-devel(x86-64) ( =  0.56.17-4.el10)"
