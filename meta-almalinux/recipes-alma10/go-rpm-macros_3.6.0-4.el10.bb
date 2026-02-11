
PN = "go-rpm-macros"
PE = "0"
PV = "3.6.0"
PR = "4.el10"
PACKAGES = "go-filesystem go-rpm-macros go-rpm-templates go-srpm-macros"


URI_go-filesystem = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/go-filesystem-3.6.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:go-filesystem = ""
RPROVIDES:go-filesystem = "go-filesystem ( =  3.6.0-4.el10) go-filesystem(x86-64) ( =  3.6.0-4.el10)"

URI_go-rpm-macros = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/go-rpm-macros-3.6.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:go-rpm-macros = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/python3 ( ) /usr/bin/bash ( ) golang ( ) go-filesystem ( =  3.6.0-4.el10) go-srpm-macros ( =  3.6.0-4.el10)"
RPROVIDES:go-rpm-macros = "compiler(golang) ( ) rpm_lua(fedora.rpm.go) ( ) rpm_macro(go_generate_buildrequires) ( ) rpm_macro(goaltinstall) ( ) rpm_macro(gobuild) ( ) rpm_macro(gobuild_baseflags) ( ) rpm_macro(gobuild_baseflags_shescaped) ( ) rpm_macro(gobuild_ldflags) ( ) rpm_macro(gobuild_ldflags_shescaped) ( ) rpm_macro(gobuildflags) ( ) rpm_macro(gobuildflags_shescaped) ( ) rpm_macro(gobuildroot) ( ) rpm_macro(gocheck) ( ) rpm_macro(gocheckflags) ( ) rpm_macro(gochecks) ( ) rpm_macro(gochecksflags) ( ) rpm_macro(gocompilerflags) ( ) rpm_macro(godefaultflags) ( ) rpm_macro(godevelinstall) ( ) rpm_macro(goenv) ( ) rpm_macro(gofilelist) ( ) rpm_macro(goignoreflags_examples) ( ) rpm_macro(goinstall) ( ) rpm_macro(goinstallflags) ( ) rpm_macro(gomkdir) ( ) rpm_macro(gomodulesmode) ( ) rpm_macro(gopkginstall) ( ) rpm_macro(goprep) ( ) rpm_macro(goprovflags) ( ) rpm_macro(goreqflags) ( ) rpm_macro(gotest) ( ) rpm_macro(gotestextldflags) ( ) rpm_macro(gotestflags) ( ) go-rpm-macros ( =  3.6.0-4.el10) bundled(golist) ( =  0.10.4) compiler(go-compiler) ( =  2) go-rpm-macros(x86-64) ( =  3.6.0-4.el10)"

URI_go-rpm-templates = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/go-rpm-templates-3.6.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:go-rpm-templates = "go-rpm-macros ( =  3.6.0-4.el10)"
RPROVIDES:go-rpm-templates = "go-rpm-templates ( =  3.6.0-4.el10) go-rpm-templates(x86-64) ( =  3.6.0-4.el10)"

URI_go-srpm-macros = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/go-srpm-macros-3.6.0-4.el10.noarch.rpm;unpack=0"
RDEPENDS:go-srpm-macros = "redhat-rpm-config ( )"
RPROVIDES:go-srpm-macros = "rpm_lua(fedora.srpm.go) ( ) rpm_macro(gccgo_arches) ( ) rpm_macro(go_arches) ( ) rpm_macro(go_compiler) ( ) rpm_macro(goaltfiles) ( ) rpm_macro(goaltpkg) ( ) rpm_macro(godevelfiles) ( ) rpm_macro(godevelpkg) ( ) rpm_macro(golang_arches) ( ) rpm_macro(golang_arches_future) ( ) rpm_macro(gometa) ( ) rpm_macro(gopath) ( ) rpm_macro(gopkg) ( ) rpm_macro(gopkgfiles) ( ) rpm_macro(gorpmname) ( ) go-srpm-macros ( =  3.6.0-4.el10)"
