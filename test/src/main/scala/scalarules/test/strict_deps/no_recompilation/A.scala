package scalarules.test.strict_deps.no_recompilation;

object A {
	def foo = {
		B.foo
	}
}
