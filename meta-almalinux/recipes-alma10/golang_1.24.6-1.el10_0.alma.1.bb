
PN = "golang"
PE = "0"
PV = "1.24.6"
PR = "1.el10_0.alma.1"
PACKAGES = "go-toolset golang golang-bin golang-docs golang-misc golang-race golang-src golang-tests"


URI_go-toolset = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/go-toolset-1.24.6-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:go-toolset = "delve ( ) golang ( =  1.24.6-1.el10_0.alma.1)"
RPROVIDES:go-toolset = "go-toolset ( =  1.24.6-1.el10_0.alma.1) go-toolset(x86-64) ( =  1.24.6-1.el10_0.alma.1)"

URI_golang = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/golang-1.24.6-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:golang = "openssl-devel ( ) golang-bin ( =  1.24.6-1.el10_0.alma.1) golang-race ( =  1.24.6-1.el10_0.alma.1) golang-src ( =  1.24.6-1.el10_0.alma.1)"
RPROVIDES:golang = "golang ( =  1.24.6-1.el10_0.alma.1) go ( =  1.24.6-1.el10_0.alma.1) golang(x86-64) ( =  1.24.6-1.el10_0.alma.1)"

URI_golang-bin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/golang-bin-1.24.6-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:golang-bin = "/bin/sh ( ) /usr/sbin/update-alternatives ( ) gcc ( ) glibc ( ) go ( =  1.24.6-1.el10_0.alma.1)"
RPROVIDES:golang-bin = "golang-bin ( =  1.24.6-1.el10_0.alma.1) golang-bin(x86-64) ( =  1.24.6-1.el10_0.alma.1) golang-go ( =  1.24.6-1.el10_0.alma.1)"

URI_golang-docs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/golang-docs-1.24.6-1.el10_0.alma.1.noarch.rpm;unpack=0"
RDEPENDS:golang-docs = "golang ( =  1.24.6-1.el10_0.alma.1)"
RPROVIDES:golang-docs = "golang-docs ( =  1.24.6-1.el10_0.alma.1)"

URI_golang-misc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/golang-misc-1.24.6-1.el10_0.alma.1.noarch.rpm;unpack=0"
RDEPENDS:golang-misc = "golang ( =  1.24.6-1.el10_0.alma.1)"
RPROVIDES:golang-misc = "golang-misc ( =  1.24.6-1.el10_0.alma.1)"

URI_golang-race = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/golang-race-1.24.6-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:golang-race = "golang ( =  1.24.6-1.el10_0.alma.1)"
RPROVIDES:golang-race = "golang-race ( =  1.24.6-1.el10_0.alma.1) golang-race(x86-64) ( =  1.24.6-1.el10_0.alma.1)"

URI_golang-src = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/golang-src-1.24.6-1.el10_0.alma.1.noarch.rpm;unpack=0"
RDEPENDS:golang-src = ""
RPROVIDES:golang-src = "golang-src ( =  1.24.6-1.el10_0.alma.1)"

URI_golang-tests = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/golang-tests-1.24.6-1.el10_0.alma.1.noarch.rpm;unpack=0"
RDEPENDS:golang-tests = "golang ( =  1.24.6-1.el10_0.alma.1)"
RPROVIDES:golang-tests = "libtiffxx.so.6()(64bit) ( ) libtiffxx.so.6(LIBTIFFXX_4.0)(64bit) ( ) golang-tests ( =  1.24.6-1.el10_0.alma.1)"
